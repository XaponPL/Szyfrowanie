
import java.io.*;
public class cezar {

    public static void main(String[] args) {
        
       /* int offset = 1;
   
        String txt = "ALA   ZZZZ";
        String out = "";
        char znaki[] = txt.toCharArray();
        
        if(txt.matches("^[A-Z ]*$")){
        
            for(int i=0; i<znaki.length; i++){
            
            int nr =znaki[i]-65;
            nr = nr + offset;
            nr = nr%26;
            nr = nr+65;
            znaki[i]=(char) nr;
        }
        for(int z=0;z<znaki.length;z++){
            out = out+znaki[z];
        }  
        
        System.out.println(txt);
        System.out.println("  |  ");
        System.out.println("  |  ");
        System.out.println("  V  ");
        System.out.println("szyfrowanie");
        System.out.println("  |  ");
        System.out.println("  |  ");
        System.out.println("  V  ");
        System.out.println(out);
    }
        else throw new IllegalArgumentException("Tekst zawiera znaki spoza ustalonego alfabetu.");
    }*/
        
        String txt = "BLA ZZZZ";
        Cipher code = new Cipher();
        System.out.println(code.encrypt(txt));
}
}
