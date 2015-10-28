package text;

import java.util.*;

public class FatihB implements Processor {
    public String process(String input) {
        String[] words = input.split("\\p{Space}|\\p{Punct}");
        Set<String> ordered = new TreeSet<>();
        for(String s:words) ordered.add(s.toLowerCase());
        return ordered.toString();
    }
    public String description(String source) {
        return "words in "+source+" converted to the lower case and ordered alphabetically";
    }
    public String author() {
        return "Fatih Barmanbay";
    }
}
