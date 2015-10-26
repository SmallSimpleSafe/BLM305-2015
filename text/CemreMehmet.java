package text;

import java.util.*;

public class CemreMehmet implements Processor {

    public String process(String input) {
        
        String[] words = input.split(" ");
        String[] initials = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            initials[i] = "" + words[i].charAt(0);
        }

        List<String> initials2 = new ArrayList<>();
        for (String c : initials) {
            initials2.add(c);
        }

        return initials2.toString();
    }
    
    public String description(String source) {
        return "first letters in " + source;
    }
    
    public String author() {
        return "Cemre Mehmet Kupeli";
    }
}
