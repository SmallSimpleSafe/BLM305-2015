
package text;

import java.util.*;

public class Merve implements Processor {
    public String process(String input) {
       String[] words = input.split(" ");
       StringBuffer buffer = new StringBuffer();
       for (int i=words.length-1;i>=0;i--){
	buffer.append(words[i]);
        buffer.append(" ");
       }
 return  buffer.toString();
    }
    public String description(String source) {
        return source + "reverse the words.";
    }
    public String author() {
        return "Merve Tiris";
    }
}
