package quote;

public class SmallSimple implements Quotation {
    public int year() {
        return 1973;
    }
    public String text() {
        String p = "Small Is Beautiful -- the aim ought to be to obtain the maximum ";
        String s = "amount of well being with the minimum amount of consumption.";
        return p+s;
    }
    public String author() {
        return "Schumacher";
    }
    public String reference() {
        return "https://en.wikipedia.org/wiki/Small_Is_Beautiful";
    }
}
