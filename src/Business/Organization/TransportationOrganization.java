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
public class TransportationOrganization extends Organization{
    public TransportationOrganization() {
        super(Organization.Type.Transportation.getValue());
    }
    
    //DeliveryRole
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        //DeliveryRole
        roles.add(new DeliveryRole());
        roles.add(new DeliveryManager());
        return roles;
    }
    
}