/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Andreas
 */
public class InvalidEmailException extends IllegalArgumentException{
    char[] invalids;
    StringBuilder symbols;
    public InvalidEmailException(){
        
    }
    
    public InvalidEmailException(char[] invalids){
        this.invalids=invalids;
    }
    
    @Override
    public String toString() {
        for (char invalid : invalids) {
            
            symbols.append("'");
            symbols.append(invalid);
            symbols.append("'");
            symbols.append(",");
        }
        symbols.deleteCharAt(symbols.length());
        return "Invalid Symbols in Email: "+symbols;
    }

    @Override
    public String getMessage() {
        return toString();
    }
}
