
public class Cipher {
    
    private int offset = 1;

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
    private String alfabet = "ABCDEFGHIJKLMNOPRSTQWXYZ ";
    private String regex = "^[A-Z ]*$";
    
    
    public String encrypt(String txt){
        
        
        //char znaki[] = txt.toCharArray();
        String out = "";
        int zmienna=0;
        
        if(match(txt)){
            int alf = alfabet.length();
         for(int i=0; i<txt.length(); i++){
            zmienna=zmienna + txt.indexOf(i);
            zmienna=zmienna + offset;
            out=out+alfabet.charAt(zmienna);
            
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

    private boolean match(String txt) {
        return (txt.matches(regex))?true:false;
    }
    
    }
    

