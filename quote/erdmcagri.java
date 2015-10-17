package quote;

public class erdmcagri implements Quotation {
    public int year() {
        return 2009;
    }
    public String text() {
        String p = "A boy wakes up in a box with no memory of his past, other than that his name is Thomas.\n";
        String s = "When the elevator doors open, he is pulled into a glade by a group of teenage boys who also have no memories besides their name.";
        return p+s;
    }
    public String author() {
        return "James Dashner";
    }
    public String reference() {
        return "https://en.wikipedia.org/wiki/The_Maze_Runner";
    }
}
