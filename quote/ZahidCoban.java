package quote;

public class ZahidCoban implements Quotation {
    public int year() {
        return 1938;
    }
    public String text() {
        String p = "Peace cannot be kept by force;\n";
        String s = "it can only be achieved by understanding.";
        return p+s;
    }
    public String author() {
        return "Albert Einstein";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/authors/a/albert_einstein.html";
    }
}
