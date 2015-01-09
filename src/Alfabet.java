
public class Alfabet {
    private String alfabet;
     private String regex = "^[A-Z ]*$";
     
    Alfabet(String alfa){
        this.alfabet = alfa;
    }
    public int index(char c){
        
        return this.alfabet.indexOf(c);
    }
    public char charAt(int ind){
        
        return this.alfabet.charAt(ind);
    }
    public int length(){
        
        return this.alfabet.length();
    }
    public boolean isTextVaild(String text){
        
        return (text.matches(this.regex))?true:false;
    }
}
