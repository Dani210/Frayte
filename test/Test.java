
import inventory.User;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andreas
 */
public class Test {
    public static void main(String[] args) {
        try {
            User me = new User("andi.kreuzer17@gmail.com","Andi2002");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
