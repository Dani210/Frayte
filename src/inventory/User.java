/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inventory;

import exceptions.InvalidEmailException;
import security.Hasher;
/**
 *
 * @author Andreas
 */
public class User {
    String email; 
    String password; 
    
    public User(String email, String password)
        throws Exception{
        char[] invalids = Inventory.Validation.verify(email);
        if(invalids.length==0){
            this.email=email;
            this.password=password;
        }else{
            throw new InvalidEmailException(invalids);
        }
    }
}

