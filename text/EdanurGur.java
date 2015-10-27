package text;

import java.util.*;

class EdaGitHub implements Processor {

    public String process(String input) {
        char[] harf = input.toLowerCase().toCharArray();
        List<Character> harfler = new ArrayList<>();
        
        for(Character t:harf){
            harfler.add(t);
        }
        
        for(int i=0; i<harfler.size(); i++){
            if(harfler.get(i).equals('ı')){
                harfler.set(i, 'i');
            }
            
            else if(harfler.get(i).equals('ö')){
                harfler.set(i,'o');
            }
            
            else if(harfler.get(i).equals('ü')){
                harfler.set(i,'u');
            }
            
            else if(harfler.get(i).equals('ç')){
                harfler.set(i,'c');
            }
            
            else if(harfler.get(i).equals('ğ')){
                harfler.set(i,'g');
            }
            
            else if(harfler.get(i).equals('ş')){
                harfler.set(i,'s');
            }
            
            else{}
        }
        
        char[] again = new char[harfler.size()];
        
        for (int i = 0; i < again.length; i++) {
            again[i] = harfler.get(i);
            System.out.println(again[i]);
        }
        String engString = new String(again);
        System.out.println(engString);
        return engString;
    }
    
    public String description(String source) {
        return "Converted Turkish letters to English";
    }

    public String author() {
        return "Edanur Gür";
    
    }
}
