package quote;

public class DilaraArı implements Quotation {
    public int year() {
        return 1980;
    }
    public String text() {
        String t1 = "If something is expensive to develop, and somebody's not going to get paid, it won't get developed. ";
        String t2 = "So you decide: Do you want software to be written, or not?";
        return t1+t2;
    }
    public String author() {
        return "Bill Gates";
    }
    public String reference() {
        return "https://en.wikiquote.org/wiki/Bill_Gates";
    }
}
