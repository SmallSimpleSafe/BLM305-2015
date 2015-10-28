/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package text;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Hp
 */
public class Gizem implements Processor {

    @Override
    public String process(String input) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] chars = input.toCharArray();
        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Character> keys = map.keySet();

        for (Character ch : keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " " + map.get(ch));

            }
        }

        return map.toString();

    }

    @Override
    public String description(String source) {

        return source + "to find duplicate Characters in a String";
    }

    @Override
    public String author() {
        return "Gizem Nur Meşe";
    }

}
