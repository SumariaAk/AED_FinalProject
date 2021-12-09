/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationDirectory;
    
    public OrganizationDirectory() {
        organizationDirectory = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Inventory.getValue())){
            organization = new InventoryOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Lab.getValue())){
            organization = new LabOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Lhd.getValue())){
            organization = new LhdOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Transportation.getValue())){
            organization = new TransportationOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Dealer.getValue())){
            organization = new DealerOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Logistic.getValue())){
            organization = new LogisticOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Hospital.getValue())){
            organization = new HospitalOrganization();
            organizationDirectory.add(organization);
        }
        else if (type.getValue().equals(Type.Cdc.getValue())){
            organization = new CdcOrganization();
            organizationDirectory.add(organization);
        }
        
        return organization;
        
            
        
    }
    
}
