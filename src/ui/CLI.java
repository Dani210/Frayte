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

public class CLI
{

    private static final Menu menu;

    static {
        menu = new Menu();
    }

    public static void main(String[] args)
    {
        Menu.Selection selection = Menu.Selection.LOGOUT;

        do {
            menu.printMenu();

            try {
                selection = menu.getSelection();
            } catch (IOException ioe) {
                System.out.println(ioe);
            } catch(NumberFormatException nfe){
                System.out.println(nfe);
            } catch(Exception e){
                System.out.println("Unknown error encountered.");
            }

        } while (selection != Menu.Selection.valueOf("LOGOUT"));
    }

}
