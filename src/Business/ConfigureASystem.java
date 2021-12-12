/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Person.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author akash
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem business = EcoSystem.getInstance();
        Person person = null;
     
        //create the user account
        //create the system admin
        UserAccount sysAdmin = business.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole());       
        return business;
    }
    
}
