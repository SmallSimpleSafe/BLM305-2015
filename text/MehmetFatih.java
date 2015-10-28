package text;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class MehmetFatih implements Processor {

    @Override
    public String process(String input) {
        String[] words = input.split(" ");
        Set<String> eachWord = new TreeSet<>();
        Collections.addAll(eachWord, words);

        for (String i : eachWord) {

            int wordCount = 0;

            for (String y : words) {
                if (Objects.equals(i, y)) wordCount++;
            }

            System.out.println("Count of word " + i + " is " + wordCount);
        }

        return eachWord.toString();
    }

    @Override
    public String description(String source) {
        return source + " the program returns count of each word that exist in input.";
    }

    @Override
    public String author() {
        return "Mehmet Fatih Tanis";
    }
}
