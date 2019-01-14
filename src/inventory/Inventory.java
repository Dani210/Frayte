/*
 * Copyright (C) 2018 owner
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
