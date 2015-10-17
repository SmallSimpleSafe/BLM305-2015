package quote;

public class SmallSimple implements Quotation {
    public int year() {
        return 2005;
    }
    public String text() {
        String p = "GIT; yazýlým geliþtirme süreçlerinde kullanýlan, hýz odaklý, daðýtýk çalýþan bir sürüm kontrol ve kaynak kod yönetim sistemidir";
        String s = " Ýlk sürümü Linux çekirdeði'nin geliþtirilmesinde kullanýlmak üzere 2005 yýlýnda bizzat Linus Torvalds tarafýndan tasarlanýp geliþtirilmiþ";
        return p+s;
    }
    public String author() {
        return "Linus Torvalds";
    }
    public String reference() {
        return "https://tr.wikipedia.org/wiki/Git_(yaz%C4%B1l%C4%B1m)";
    }
}
