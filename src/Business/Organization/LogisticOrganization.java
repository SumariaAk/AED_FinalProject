/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class LogisticOrganization extends Organization{
    public LogisticOrganization() {
        super(Organization.Type.Logistic.getValue());
    }
    
    //LogisticsRole
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //LogisticsRole
        roles.add(new LogisticRole());
        return roles;
    }
    
}
