package quote;

public class CemreK implements Quotation {
    public int year() {
        return 1944;
    }
    public String text() {
        String p = "Perfection is Achieved Not When There Is Nothing More to Add";
        String s = "But When There Is Nothing Left to Take Away";
        return p+s;
    }
    public String author() {
        return "Antoine de Saint-Exupery";
    }
    public String reference() {
        return "http://lifehacker.com/5962245/perfection-is-achieved-not-when-there-is-nothing-more-to-add-but-when-there-is-nothing-left-to-take-away";
    }
}
