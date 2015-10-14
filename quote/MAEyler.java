package quote;

public class MAEyler implements Quotation {
    public int year() {
        return 1938;
    }
    public String text() {
        String p = "Learn from yesterday, live for today, hope for tomorrow.\n";
        String s = "The important thing is not to stop questioning.";
        return p+s;
    }
    public String author() {
        return "Albert Einstein";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/authors/a/albert_einstein.html";
    }
}