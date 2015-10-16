package quote;

public class BeyzaKarabul implements Quotation {
    public int year() {
        return 1955;
    }
    public String text() {
        String p = "There is no better than adversity.\n";
        String s = "Every defeat, every heartbreak, every loss, contains its own seed, its own lesson on how to improve your performance the next time.";
        return p+s;
    }
    public String author() {
        return "Malcom X";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/authors/m/malcolm_x.html";
    }
}
