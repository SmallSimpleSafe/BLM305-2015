
package text;

import java.util.*;

public class Merve implements Processor {
    public String process(String input) {
       String[] words = input.split(" ");
        
        List<String> reversewords = Arrays.asList(words);
        Collections.reverse(reversewords);
        words =(String[]).reversewords.toArray();

       for (int i=0; i<words.length;i++){
	System.out.println(words[i]);
}
    }
    public String description(String source) {
        return source + "reverse the words and ordered.";
    }
    public String author() {
        return "Merve Týrýs";
    }
}
