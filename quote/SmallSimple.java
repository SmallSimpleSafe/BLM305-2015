package quote;

public class SmallSimple implements Quotation {
    public int year() {
        return 1973;
    }
    public String text() {
        return "Small Is Beautiful";
    }
    public String author() {
        return "Schumacher";
    }
    public String reference() {
        return "https://en.wikipedia.org/wiki/Small_Is_Beautiful";
    }
}
