package quote;

public class CansuKubra implements Quotation {
    public int year() {
        return 1881;
    }
    public String text() {
        String p = "Imagination was given to man to compensate him for what he is not,";
        String s = " and a sense of humor was provided to console him for what he is.";
        return p+s;
    }
    public String author() {
        return "Oscar Wilde";
    }
    public String reference() {
        return "https://litemind.com/best-famous-quotes/";
    }
}
