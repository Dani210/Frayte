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
package ui;

import java.io.IOException;
import java.util.Scanner;

public class Menu
{
    private final Scanner input;

    public Menu()
    {
        this.input = new Scanner(System.in);
    }
    
    
    public void printMenu(){
        for(Selection s : Selection.values()){
            System.out.println(
                String.format("( %2d ) - %s\n", s.n, s.description));
        }
    }
    
    public Selection getSelection()
            throws NumberFormatException, IOException
    {
        int n;
        try{
            n = Integer.parseInt(input.nextLine());
            for(Selection sel : Selection.values()){
                if(n == sel.n){
                    return sel;
                }
            }
        }catch(NumberFormatException nfe){
            throw new NumberFormatException("Please enter a valid number" + "\nError at " + nfe.getCause());
        }
        
        throw new IOException("No such option known.");
    }
    
    public enum Selection{
        GUIDED(0, "Guided Tour"),
        REGISTER(1, "Registration"),
        LOGIN(2, "Login"),
        LOGOUT(99, "Logout");
        
        private final int n;
        private final String description;
        
        private Selection(int n, String desc){
            this.n = n;
            this.description = desc;
        }
        
    }
}
