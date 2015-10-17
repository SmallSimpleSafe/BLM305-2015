package quote;

public class Muhammedglc implements Quotation {
    
    public int year() {
        return  2001;
    }
    public String text() {
        String p = "Vikipedi, kullanıcıları tarafından ortaklaşa olarak birçok dilde hazırlanan, özgür, bağımsız, ücretsiz, reklamsız, kâr amacı gütmeyen bir internet ansiklopedisi. Wiki teknolojisi kullanılarak hazırlanmaktadır. \n";
        String s = "Vikipedi, özgür ansiklopedi.";
        return p+s;
    }
    public String author() {
        return "Wikimedia Foundation";
    }
    public String reference() {
        return "https://tr.wikipedia.org/wiki/Vikipedi";
    }
}