
package text;

import java.util.*;


public class BeyzaKarabul implements Processor {
    @Override
    public String process(String input) {
        char[] charArray = input.toCharArray();
        ArrayList array = new ArrayList();
        for (char s : charArray) array.add(s);
        return array.toString();
        
    }
    @Override
    public String description(String source) {
        return source+" converted to char array";
    }
    @Override
    public String author() {
        return "Beyza Nur Karabul";
    }
}
