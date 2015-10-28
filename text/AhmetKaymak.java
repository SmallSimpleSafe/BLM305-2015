package text;

import java.util.*;

public class ahmetkaymak implements Processor {

    @Override
    public String process(String input) {
        String cyrptedText = "";
        Hashtable<String, String> shiftTable = new Hashtable<>();
        String alphabet = "abcdefghijklmnopqrstuwxvyzABCDEFGHIJKLMNOPQRSTUWXVYZ";
        int shiftLength = Integer.parseInt(input.substring(input.length() - 1, input.length()));
        for (int i = 0; i < alphabet.length(); i++) {
            char c = (char) (alphabet.charAt(i));
            if (c >= 'A' && c <= 'Z') {

                shiftTable.put(String.valueOf(c), String.valueOf((char) ((c - 'A' + shiftLength) % 26 + 'A')));
                
            } else if (c >= 'a' && c <= 'z') {

                shiftTable.put(String.valueOf(c), String.valueOf((char) ((c - 'a' + shiftLength) % 26 + 'a')));
                
            } else {

                shiftTable.put(String.valueOf(c), String.valueOf((char) c));
                
            }
        }

        for (int i = 0; i < input.length() - 1; i++) {
            cyrptedText = cyrptedText + shiftTable.get(String.valueOf(input.charAt(i)));
        }
        return cyrptedText;

    }

    @Override
    public String description(String source) {
        return source + "This is basic Ceaser Cipher algorithm. String input's last characher should be an integer"
                + "because it is going to use for shifting the original text. ";
    }

    @Override
    public String author() {
        return "Ahmet Kaymak";
    }
}
