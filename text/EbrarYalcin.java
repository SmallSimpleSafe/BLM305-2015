package text;

import java.util.*;
import java.util.ArrayList;

public class EbrarYalcin implements Processor {
    public String process(String input) {
        ArrayList S = new ArrayList();
        for (int i = input.length() - 1; i >= 0; i--) {
            S.add(input.charAt(i));
        }
        for (Object s : S) {
            System.out.println(s);
        }
        return S.toString();
    }
    public String description(String source) {
        return "String reversal "+source;
    }
    public String author() {
        return "Ebrar Yalçýn";
    }
}
