package text;

import java.util.*;

public class MuhammedGulcu implements Processor {
    @Override
    public String process(String input) {
        String[] str = input.split(" ");
        ArrayList arrayList = new ArrayList();
        for(String s : str){
            arrayList.add("$"+s);
        }
        return arrayList.toString();
        
    }
    @Override
    public String description(String source) {
        return source+" spliting by space and adding dollar mark in the start of all word";
    }
    @Override
    public String author() {
        return "Muhammed Gulcu";
    }
}
