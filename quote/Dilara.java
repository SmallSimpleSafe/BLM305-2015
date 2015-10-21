package quote;

public class Dilara implements Quotation {
    public int year() {
        return 1230;
    }
    public String text() {
    String t1 = "Mevlana Sözleri - Sevgide güneş gibi ol, dostluk ve kardeşlikte akarsu gibi ol, hataları örtmede gece gibi ol, ";
    String t2 = "tevazuda toprak gibi ol, öfkede ölü gibi ol, her ne olursan ol, ya olduğun gibi görün, ya göründüğün gibi ol.";
        return t1+t2;
    }
    public String author() {
        return "Mevlânâ Celâleddîn-î Rûmî";
    }
    public String reference() {
        return "http://mevlanasozleri.com/page/12";
    }
}
