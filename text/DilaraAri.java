package text;

import java.util.*;

public class DilaraAri implements Processor {
    public String process(String input) {
    
        String vowels = "aeıioöuü";
        
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) >= 0) {
                list.add(input.charAt(i)+"");
            }
        }
        return list.toString();
    }
    public String description(String source) {
        return "Find vowels in "+source;
    }
    public String author() {
        return "A Dilara Ari";
    }
}
