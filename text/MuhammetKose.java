package text;
import java.util.*;

public class MuhammetKose implements Processor {
    public String process(String input) {
        String sesliler = "aeoöuüýiAEOÖUÜIÝ";
        int toplam = 0;
        for (int i = 0; i < input.length(); i++) {
            if (sesliler.indexOf(input.charAt(i)) != -1) {
                toplam++;
            }
        }  
        return Integer.toString(toplam);
    }
    public String description(String source) {
        return "number of syllable: "+source;
    }
    public String author() {
        return "Muhammet Kose";
    }
}
