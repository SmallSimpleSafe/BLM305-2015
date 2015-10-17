package quote;

public class EbrarYalcin implements Quotation {
    public int year() {
          return 1945;
    }
    public String text() {
        String p = "And I can fight only for something that I love, love only what I respect, ";
        String s = " and respect only what I at least know.” ";
        return p+s;
    }
    public String author() {
        return "Adolf Hitler";
    }
    public String reference() {
        return "http://www.goodreads.com/author/quotes/30691.Adolf_Hitler";
    }
}
