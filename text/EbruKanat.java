
package text;

import java.util.*;


public class EbruKanat implements Processor {
   
    public String process(String input) {
          
        String [] harfler = new String[input.length()];
        
        for (int i = 0; i < harfler.length; i++) {
            harfler[i] = "" + input.charAt(i);
        }
        
        List<String> siraliHarf = new ArrayList<>();
        
        for (String s : harfler) {
            siraliHarf.add(s);
        }
        
        Collections.sort(siraliHarf);
        
        
        return siraliHarf.toString();
        
    }
    
    public String description(String source) {
        return "alphabetical order in" + source;
    }
   
   
    public String author() {
        return "Ebru Kanat";
    }
}
