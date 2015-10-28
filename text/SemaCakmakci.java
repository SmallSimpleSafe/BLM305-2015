package text;

public class SemaCakmakci implements Processor {
    public String process(String input) {
        return input.concat("write once run anywhere");
    }
    public String description(String source) {
        return source+" the String that is concatenated to the end of this String";
    }
    public String author() {
        return "Sema Cakmakci";
    }
}
