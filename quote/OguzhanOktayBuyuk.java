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
        return 1912;
    }
    public String text() {
        String p = "Artificial Intelligence -- A computer would deserve to be called intelligent ";
        String s = "if it could deceive a human into believing that it was human.";
        return p+s;
    }
    public String author() {
        return "Alan Turing";
    }
    public String reference() {
        return "https://en.wikipedia.org/wiki/Alan_Turing";
    }
}