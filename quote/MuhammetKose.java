package quote;

public class MuhammetKose implements Quotation {
    public int year() {
        return 1978;
    }
    public String text() {
        String p = "I hated every minute of training, but I said, ";
        String s = "'Don't quit. Suffer now and live the rest of your life as a champion'.";
        return p+s;
    }
    public String author() {
        return "Muhammad Ali";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/authors/m/muhammad_ali.html";
    }
}
