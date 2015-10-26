package quote;

public class SemaCakmakci implements Quotation {
    public int year() {
        return 1564;
    }
    public String text() {
        String p = "What's done cannot be undone.";
        return p;
    }
    public String author() {
        return "William Shakespeare";
    }
    public String reference() {
        return "http://www.goodreads.com/quotes/156073-what-s-done-cannot-be-undone";
    }
}
