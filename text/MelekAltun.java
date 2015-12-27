package text;

import java.util.*;

public class MelekAltun implements Processor {
    @Override
    public String process(String input) {
        String[] str = input.split(",");
        List list = new ArrayList();
        for (String a : str){
            list.add(a);
        } 
        return list.toString();
        
    }
    @Override
    public String description(String source) {
        return source+" adding the data seperated by comma to list.";
    }
    @Override
    public String author() {
        return "Melek Altun";
    }
}
