/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andreas
 */
public class Inventory {
    
    
    
    public static class Validation{
        static String invalids;
        
        {
            try {
                Scanner sc = new Scanner(new File("invalidChars"));
                while(sc.hasNext()){
                    String line = sc.nextLine();
                    if(!(line.charAt(0)=='#')){
                        invalids += line.charAt(0);
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
        public static char[] verify(String text){
            StringBuilder currentInvalids= new StringBuilder();
            for (char s : text.toCharArray()) {
                if(invalids.contains(""+s)) currentInvalids.append(s);
            }
            return currentInvalids.toString().toCharArray();
        }
    }
}
