package text;

import java.util.Set;
import java.util.TreeSet;

public class ZahidCoban implements Processor {

    public String process(String input) {
        String[] kelimeler = input.split("\\p{Space}|\\p{Punct}");
        Set<String> agac = new TreeSet<>();
        for (String s : kelimeler) {
            agac.add(s);
        }
        return agac.toString();
    }

    public String description(String source) {
        return " alphabetic order of: " + source;
    }

    public String author() {
        return "M Zahid Çoban";
    }
}
