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
public class LhdOrganization extends Organization {
    public LhdOrganization() {
        super(Organization.Type.Lhd.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LhdLeadRole());
        return roles;
    }
    
}
