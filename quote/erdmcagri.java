package quote;

public class erdmcagri implements Quotation {
    public int year() {
        return null;
    }
    public String text() {
        String p = "I can promise to be candid.\n";
        String s = ", but not to be impartial.";
        return p+s;
    }
    public String author() {
        return "Goethe";
    }
    public String reference() {
        return "http://www.bartleby.com/345/authors/193.html";
    }
}
