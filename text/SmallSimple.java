package text;

public class SmallSimple implements Processor {
    public String process(String t) {
        String[] a = t.split("\n");
        String p = a.length+" lines";
        a = t.split("\\p{Space}|\\p{Punct}");
        String s = a.length+" words";
        return p+"\n"+s;
    }
    public String description() {
        return "Number of lines & words";
    }
    public String author() {
        return "Small Simple";
    }
}
