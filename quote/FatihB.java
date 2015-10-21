package quote;

public class FatihB implements Quotation {
    public int year() {
        return 1564;
    }
    public String text() {
        String p = "The greater danger for most of us lies not in setting our aim too high and falling short; ";
        String s = "but in setting our aim too low, and achieving our mark.";
        return p+s;
    }
    public String author() {
        return "Michelangelo";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/quotes/m/michelange108779.html";
    }
}
