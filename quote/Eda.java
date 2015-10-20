package quote;

public class Eda implements Quotation {
    public int year() {
        return 1850;
    }
    public String text() {
        String p = "What we think, or what we know, or what we believe is, in the end, of little consequence.";
        String s = "The only consequence is what we do.";
        return p+s;
    }
    public String author() {
        return "John Ruskin";
    }
    public String reference() {
        return "https://litemind.com/best-famous-quotes/";
    }
}
