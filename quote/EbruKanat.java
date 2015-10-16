package quote;

public class EbruKanat implements Quotation {
    public int year() {
        return 1983;
    }
    public String text() {
        String p = "Courage is not the absence of fear,";
        String s = "but rather the judgement that something else is more important than fear.";
        return p+s;
    }
    public String author() {
        return "Ambrose Redmoon";
    }
    public String reference() {
        return "https://litemind.com/best-famous-quotes/";
    }
}
