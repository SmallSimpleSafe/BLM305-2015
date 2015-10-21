package text;

public class AkifEyler implements Processor {
    public String process(String s) {
        return s.toLowerCase();
    }
    public String description() {
        return "Convert to lower case";
    }
    public String author() {
        return "M Akif Eyler";
    }
}
