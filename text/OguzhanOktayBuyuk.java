
package text;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author OGUZHAN
 */
public class OguzhanOktayBuyuk implements Processor {

    public String process(String input) {
        HashMap<String, String> words = new HashMap<>();
        String[] divisionofWords = input.replaceAll("[^a-zA-Z\\p{L} ]", "").split("\\s+");//Kelimeleri bulup ayirma islemi.(Noktalama isaretlerini cikariyorum).
        String reverseText = "";
        Set<String> palindromWords = new TreeSet<>();//Palindrom kelimeler icin kume icinde tek olarak ekleme.
        for (String word : divisionofWords) {
            reverseText = new StringBuffer(word).reverse().toString();
            words.put(word, reverseText);
            if (word.equals(reverseText)) { //Palindrom kontrolu.
                palindromWords.add(word);
            }
        }

        JOptionPane.showMessageDialog(null, new JLabel( //Palindrom kelime bulunursa bunlari JOptionPane'de renkli olarak belirtiyorum.
                "<html><h2>Palindrom word(s): <font color='blue'>" + palindromWords.toString() + "</font></h2></html>"));
        return words.toString();
    }

    public String description(String source) {
        return source + " reversed and if there is palindrom string, it is found and shown on OptionPane.";
    }

    public String author() {
        return "Oguzhan Oktay Buyuk";
    }
}
