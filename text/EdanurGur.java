package text;

import java.util.ArrayList;
import java.util.List;

class EdaGitHub implements Processor{
    
    @Override
    public String process(String input) {
        char[] harf = input.toLowerCase().toCharArray();
        List<Character> harfler = new ArrayList<>();
        
        for(Character t:harf){
            harfler.add(t);
        }
        
        for(int i=0; i<harfler.size(); i++){
            if(harfler.get(i) == 305){
                harfler.set(i, 'i');
            }
            
            else if(harfler.get(i) == 246){
                harfler.set(i,'o');
            }
            
            else if(harfler.get(i) == 252){
                harfler.set(i,'u');
            }
            
            else if(harfler.get(i) == 231){
                harfler.set(i,'c');
            }
            
            else if(harfler.get(i) == 287){
                harfler.set(i,'g');
            }
            
            else if(harfler.get(i) == 351){
                harfler.set(i,'s');
            }
            
            else{}
        }
        
        char[] again = new char[harfler.size()];
        
        for (int i = 0; i < again.length; i++) {
            again[i] = harfler.get(i);
        }
        String engString = new String(again);
        return engString;
    }

    @Override
    public String description(String source) {
        return "Converted Turkish letters to English";
    }

    @Override
    public String author() {
        return "Edanur Gür";
    }
    
}
