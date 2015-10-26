package text;

import java.util.*;

public class DilaraAri implements Processor {
    public String process(String input) {
        String myString = input.substring(3, input.length());
        char [] array = myString.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char c : array)
        {
           list.add(c);
        }
        return list.toString();
    }
    public String description(String source) {
        return source+" returns the characters between the starting and ending index as a String";
    }
    public String author() {
        return "A Dilara Ari";
    }
}
