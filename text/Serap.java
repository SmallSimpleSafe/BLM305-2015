package text;

import java.util.*;

public class Serap implements Processor {

    @Override
    public String process(String input) {

        if (input.isEmpty())
            throw new NullPointerException();

        if (input.matches("[0-9]+")) {
            String[] array = input.split("");

            List<String> list = new ArrayList<>();

            Collections.addAll(list, array);
            Collections.sort(list);
            Collections.reverse(list);

            System.out.println(list.toString());
            
            return list.toString();
        } else {
            String[] array = input.split(".*\\\\d+.*");

            List<String> list = new ArrayList<>();

            Collections.addAll(list, array);

            Iterator iterator = list.iterator();
            int i = 0;

            while (iterator.hasNext()) {
                String next = iterator.next().toString();

                if (next.contains("collections") || next.contains("Collections")) {
                    System.out.println("Collection keyword was found at sentence index " + i);
                }

                i++;
            }

            return list.toString();
        }
    }

    @Override
    public String description(String source) {
        return "If input consist of digits it desc sorts the digits (no space between digits)."
                + "If input consist of strings it prints the sentence index of keyword "
                + "'Collection' by ignoring case ('.' between sentences)";
    }

    @Override
    public String author() {
        return "Serap Memişoğlu";
    }
}
