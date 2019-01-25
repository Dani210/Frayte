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
package ui_components;

import cli.CLI;
import java.util.Scanner;

public class MenuOptions
{
    private static CLI parent;
    
    static{
        parent = new CLI();
    }
    
    /**
     * Method for getting fundamental data from user
     * to start creating an account
     * 
     * @return      email, password, username
     */
    public static String[] registerNewUser(){
        String email, password, username;
        
        email = password = username = "";
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a valid email:");
        email = in.nextLine();
        
        return new String[]{email, password, username};
    }
    
    private Boolean passForValidation(String data){
        throw new UnsupportedOperationException();
    }
    
}
