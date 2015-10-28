package text;

import java.util.*;

public class CansuKubra implements Processor {

    public String process(String input) {
        
         String input2 = input.toLowerCase();
        String[] kelimeler = input.split(" ");

        boolean inceHarf = false;
        boolean kalinHarf = false;

        List<String> uymayanKelimeler = new ArrayList<>();

        for (int i = 0; i < kelimeler.length; i++) {
            inceHarf = false;
            kalinHarf = false;
            for (int j = 0; j < kelimeler[i].length(); j++) {
                if (kelimeler[i].charAt(j) == 'a' || kelimeler[i].charAt(j) == 'ý' || kelimeler[i].charAt(j) == 'o' || kelimeler[i].charAt(j) == 'u') {
                    kalinHarf = true;
                }
                if (kelimeler[i].charAt(j) == 'e' || kelimeler[i].charAt(j) == 'i' || kelimeler[i].charAt(j) == 'ö' || kelimeler[i].charAt(j) == 'ü') {
                    inceHarf = true;
                }

            }
            if (inceHarf == true && kalinHarf == true) {
                uymayanKelimeler.add(kelimeler[i]);
            }

        }

        return uymayanKelimeler.toString();
    }
    
    public String description(String source) {
        return "words do not match the great vowel harmony in" + source;
    }
    
    public String author() {
        return "Cansu Kubra Sahin";
    }
}
