package text;

import java.util.HashSet;
import java.util.Iterator;


public class semacakmakc implements Processor {
    public String process(String input) {
         String kelimeler[] = input.split(" ");
        HashSet collection = new HashSet();
        // Adding

        for (int i = 0; i < kelimeler.length; i++) {
            collection.add(i);
            System.out.println(collection);
        }
   
        System.out.println(" created"
                + ", size=" + collection.size()
                + ", isEmpty=" + collection.isEmpty());
        // Containment
        System.out.println(" contains " + kelimeler[0]
                + ": " + collection.contains(kelimeler[3]));
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
        return source+" using remove,contains,add methods";
    }
    public String author() {
        return "Sema Cakmakci";
    }
}
