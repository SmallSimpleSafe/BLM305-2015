package text;

import java.util.*;

public class Merve implements Processor {
    public String process(String input) {
     String[] words = input.split(" ");
        for (int i = words.length-1; i >= 0; i--) {
           System.out.println(words.charAt(i));
        }
        Set<String> reversewords = new TreeSet<>();
        for (String a:words){
        reversewords.add(a);
        }
        return reversewords.toString();
    }
    public String description(String source) {
        return source + "reverse the words and ordered.";
    }
    public String author() {
        return "Merve Týrýs";
    }
}
