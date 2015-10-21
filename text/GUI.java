package text;

import java.util.*;
import java.io.File;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI implements ActionListener {

    Processor msg;
    final Map<String, Processor> Q = new TreeMap<>();
    final JFrame frm = new JFrame("Text Processor");
    final JPanel bot = new JPanel();
    final JLabel who = new JLabel("JLabel", SwingConstants.CENTER);
    final JTextArea txt = new JTextArea("JTextArea");
    final JTextField ref = new JTextField("JTextField");
    final JButton file  = new JButton("File");
    final JButton paste = new JButton("Paste");
    final JComboBox<String> menu;

    static final int 
        RESOLUTION = Toolkit.getDefaultToolkit().getScreenResolution(); 
    static final float 
        RES_RATIO = RESOLUTION/96f;  //default resolution is 96
    static final int GAP = scaled(10); //uses RES_RATIO
    static final String PACKAGE = "text";
    static final Color COLOR = Color.orange;
    static final Font SMALL = new Font("SansSerif", 0, scaled(13));
    static final Font BOLD = new Font("SansSerif", 1, scaled(16));
    static final Font LARGE = new Font("Serif", 2, scaled(16));
    static final Font DLOG = new Font("Dialog", 1, scaled(13));
    
    public GUI() {
        String[] keys = { "no Processor found" };
        if (tryDir(".") || tryDir("BLM305") || tryDir("CSE470")) 
            keys = Q.keySet().toArray(keys);
        menu = new JComboBox<String>(keys);
        if (Q.size() > 0) setMessage(0);
        
        JPanel pan = new JPanel();
        pan.setLayout(new BorderLayout(GAP, GAP-4));
        pan.setBorder(new javax.swing.border.EmptyBorder(GAP, GAP, GAP, GAP));
        pan.setBackground(COLOR);

        txt.setFont(LARGE);
        txt.setEditable(false);
        txt.setRows(15);
        txt.setColumns(45);
        txt.setWrapStyleWord(true);
        txt.setLineWrap(true);
        txt.setDragEnabled(true);
        pan.add(new JScrollPane(txt), "Center");

        ref.setFont(SMALL);
        ref.setEditable(false);
        ref.setColumns(35);
        ref.setDragEnabled(true);
        pan.add(ref, "North");
        
        pan.add(bottomPanel(), "South");

        pan.setToolTipText("Another collective project");
        menu.setToolTipText("Processor classes");
        who.setToolTipText("author()");
        txt.setToolTipText("output text");
        ref.setToolTipText("description()");

        frm.setContentPane(pan); 
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.setLocation(scaled(120), scaled(90));
        frm.pack(); 
        frm.setVisible(true);
    }
    void addItem(JComponent a, Font f) {
        a.setFont(f); bot.add(a);
    }
    JPanel bottomPanel() {
        bot.setLayout(new BoxLayout(bot, BoxLayout.X_AXIS));
        bot.setBackground(COLOR);
        
        menu.addActionListener(this);
        addItem(menu, DLOG);
        bot.add(Box.createHorizontalStrut(scaled(GAP)));
        file.addActionListener(this);
        addItem(file, DLOG);
        bot.add(Box.createHorizontalStrut(scaled(GAP)));
        paste.addActionListener(this);
        addItem(paste, DLOG);
        bot.add(Box.createHorizontalGlue());
        who.setForeground(Color.black);
        addItem(who, BOLD);
        
        return bot;
    }
    boolean tryDir(String d) {
        ClassLoader L = getClass().getClassLoader();
        File p = new File(d, PACKAGE);
        System.out.println("Try "+p);
        if (!p.exists() || !p.isDirectory()) return false;
        for (File f : p.listFiles()) {
            String s = f.getName();
            if (!s.endsWith(".class")) continue;
            String name = s.substring(0, s.length()-6);
            try {
                Class<?> c = L.loadClass(PACKAGE+"."+name);
                if (!Processor.class.isAssignableFrom(c)) continue;
                Q.put(name, (Processor)c.newInstance());
                System.out.println("  "+name);
            //ClassNotFoundException InstantiationException IllegalAccessException
            } catch(Exception e) { 
                continue;
            }
        }
        return Q.size() > 0;
    }
    public String toString() { return who.getText(); }
    public String message() { return msg.description(); }
    public void setMessage(Processor q, String s) {
        msg = q; 
        who.setText(q.author()); 
        txt.setText(q.process(s)); 
        ref.setText(q.description()); 
    }
    public void setMessage(int i) {
        String m = menu.getItemAt(i);
        System.out.println(m);
        String s = "";
        try {
            s = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard()
            .getData(java.awt.datatransfer.DataFlavor.stringFlavor).toString();
        //UnsupportedFlavorException  IOException
        } catch(Exception e) { 
            System.out.println(e);
        }
        setMessage(Q.get(m), s);
    }
    public void actionPerformed(ActionEvent e) {
        setMessage(menu.getSelectedIndex());
    }

    public static int scaled(int k) { return Math.round(k*RES_RATIO); }
    public static void main(String[] args) { new GUI(); }
}
