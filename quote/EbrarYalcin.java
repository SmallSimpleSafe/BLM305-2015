package quote;

public class EbrarYalcin implements Quotation {
    public int year() {
          return 1945;
    }
    public String text() {
        String p = "We are what we repeatedly do. ";
        String s = " Excellence, then, is not an act, but a habit.” ";
        return p+s;
    }
    public String author() {
        return "Aristotle";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/quotes/a/aristotle145967.html";
    }
}
