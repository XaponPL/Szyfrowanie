
public class Cipher {
    
    private int offset = 1;
    private Alfabet alpha;
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    private String alfabet = "ABCDEFGHIJKLMNOPRSTQWXYZ ";
   Cipher(){}
   Cipher(int offset, Alfabet){
       this.offset=offset;
       this.alpha = alpha;
   }
    
    
    public String encrypt(String txt){
        
        
        //char znaki[] = txt.toCharArray();
        String out = "";
        int zmienna=0;
        
        if(isTextVaild(txt)){
            int alf = alfabet.length();
         for(int i=0; i<txt.length(); i++){
            char ch = txt.charAt(i);
            int idx = alfabet.indexOf(ch);
            idx = (idx + offset) % alfabet.length();
            ch = alfabet.charAt(idx);
                                  
            out=out+alfabet.charAt(idx);
            
        }
       
        System.out.println(txt);
        System.out.println("  |  ");
        System.out.println("  |  ");
        System.out.println("  V  ");
        System.out.println("szyfrowanie");
        System.out.println("  |  ");
        System.out.println("  |  ");
        System.out.println("  V  ");
        
        }
        else throw new IllegalArgumentException("Tekst zawiera znaki spoza ustalonego alfabetu.");
    
        return out;
    }

   
    
    }
    

