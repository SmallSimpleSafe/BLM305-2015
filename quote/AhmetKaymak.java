package quote;

public class AhmetKaymak implements Quotation {
    public int year() {
        return 2005;
    }
    public String text() {
        String p = "Stay Hungry. Stay Foolish. And I have always wished that for myself. And now, as you graduate to begin anew, I wish that for you..\n";
        String s = "Stay Hungry. Stay Foolish.";
        return p+s;
    }
    public String author() {
        return "Steve Jobs";
    }
    public String reference() {
        return "http://news.stanford.edu/news/2005/june15/jobs-061505.html";
    }
}
