/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quote;

/**
 *
 * @author OGUZHAN
 */
public class OguzhanOktayBuyuk implements Quotation {
    public int year() {
        return 1947;
    }
    public String text() {
        String p = "Artificial Intelligence -- I believe that at the end of the century the use of words and general educated opinion will have altered so much ";
        String s = " that one will be able to speak of machines thinking without expecting to be contradicted.";
        return p+s;
    }
    public String author() {
        return "Alan Turing";
    }
    public String reference() {
        return "http://www.brainyquote.com/quotes/quotes/a/alanturing269231.html";
    }
}