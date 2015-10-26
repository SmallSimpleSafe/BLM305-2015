package quote;

public class Merve implements Quotation {
    public int year() {
        return 1943;
    }
    public String text() {
        String a = "And now here is my secret, a very simple secret: ";
        String b = "It is only with the heart that one can see rightly ";
        String c = "what is essential is invisible to the eye. ";
        return a+b+c;
    }
    public String author() {
        return "Antoine de Saint-Exupéry, The Little Prince";
    }
    public String reference() {
        return "https://www.goodreads.com/work/quotes/2180358-le-petit-prince";
    }
}
