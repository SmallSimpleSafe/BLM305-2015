package text;

import java.util.*;

public class Erdmcagri implements Processor {
    public String process(String input) {
      
            // The number of characters
            int charCount = input.length();
            
            // Number of words
            String splitWords[] = input.split(" ");
            int wordCount = splitWords.length;
            
            // The number of sentences
            String tempTextFile = input;
            tempTextFile = tempTextFile.replace('.', '_');
            tempTextFile = tempTextFile.replace('?', '_');
            tempTextFile = tempTextFile.replace('!', '_');
            String senCount[] = tempTextFile.split("_");
            int sentCount = senCount.length;
            return "The number of characters : " +charCount + "\nNumber of words : " +wordCount + "\nThe number of sentences : " +sentCount;
            
    }
	

    public String description(String source) {
        return "Count characters, words and sentences in " +source;
    }
    public String author() {
        return "Erdem Cagri Gorucu";
    }
}
