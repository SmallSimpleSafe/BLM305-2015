package text;

import java.util.HashSet;
import java.util.Iterator;

public class semacakmak implements Processor {
    public String process(String input) {
       String kelimeler[] = input.split(" ");
        HashSet collection = new HashSet();
        // Adding

        for (String a : kelimeler) {
            collection.add(a);
        }

        System.out.println(" created" + ", size=" + collection.size()
                                      + ", isEmpty=" + collection.isEmpty());
        
         // Containment
        System.out.println(" contains " + kelimeler[0]+ ": " + collection.contains(kelimeler[3]));
        // Iteration. Iterator supports hasNext, next, remove
        System.out.println(" iteration (unsorted):");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println("   " + iterator.next());
        }
        // Removing
        collection.remove(kelimeler[2]);
        //collection.clear();
        return collection.toString();

    }
    public String description(String source) {
        return source+" using add,size,isEmty,contains methods";
    }
    public String author() {
        return "Sema Cakmakci";
    }
}
