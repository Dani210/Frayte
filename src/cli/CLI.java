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
package cli;

import ui_components.Menu;
import java.io.IOException;

public class CLI implements Runnable
{

    private static final Menu MENU;

    static {
        MENU = new Menu();
    }

    @Override
    public void run()
    {
        Menu.Selection selection = null;

        do {
            MENU.printMenu();

            try {
                selection = MENU.getSelection();
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
            } catch (Exception e) {
                System.out.println("Unknown error encountered.");
            }

        } while (selection != Menu.Selection.LOGOUT);
    }

}
