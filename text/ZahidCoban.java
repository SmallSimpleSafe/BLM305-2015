package text;
import java.util.ArrayList;
import java.util.List;

public class ZahidCoban implements Processor {

    public String process(String input) {
    
        String kelimeler[]=input.split(" ");
        
        List<String> hexkelimeler=new ArrayList<>();
        
        for (int i = 0; i < kelimeler.length; i++) {
            for (int j = 0; j < kelimeler[i].length(); j++) {
                hexkelimeler.add(Integer.toHexString(kelimeler[i].charAt(j)));
            }
            hexkelimeler.add("   "); //to seperate words
        }
        
        return hexkelimeler.toString();
        
    }

    public String description(String source) {
        return " all letters have been converted to hex values in "+ source;
    }

    public String author() {
        return "M Zahid Çoban";
    }
}