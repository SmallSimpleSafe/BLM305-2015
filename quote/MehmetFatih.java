package quote;

public class MehmetFatih implements Quotation {
    public int year() {
        return 2005;
    }
    public String text() {
        String p = "GIT; yaz�l�m geli�tirme s�re�lerinde kullan�lan, h�z odakl�, da��t�k �al��an bir s�r�m kontrol ve kaynak kod y�netim sistemidir";
        String s = " �lk s�r�m� Linux �ekirde�i'nin geli�tirilmesinde kullan�lmak �zere 2005 y�l�nda bizzat Linus Torvalds taraf�ndan tasarlan�p geli�tirilmi�";
        return p+s;
    }
    public String author() {
        return "Linus Torvalds";
    }
    public String reference() {
        return "https://tr.wikipedia.org/wiki/Git_(yaz%C4%B1l%C4%B1m)";
    }
}
