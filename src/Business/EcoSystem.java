/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.CdcOrganization;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdmin;
import Business.Vaccine.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class EcoSystem extends Organization{
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private static Organization cdcOrganization;
    private VaccineDirectory vaccinedirectory;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public static Organization getCdcOrganization() {
        return cdcOrganization;
    }

    public static void setCdcOrganization(Organization cdcOrganization) {
        EcoSystem.cdcOrganization = cdcOrganization;
    }

    public VaccineDirectory getVaccinedirectory() {
        return vaccinedirectory;
    }

    public void setVaccinedirectory(VaccineDirectory vaccinedirectory) {
        this.vaccinedirectory = vaccinedirectory;
    }
    
    
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
            cdcOrganization=new CdcOrganization();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
       
        return network;
    }
    
    private EcoSystem(){
        super(null);
       System.out.println("ecosystem constructor called");
        networkList = new ArrayList<Network>();
        vaccinedirectory = new VaccineDirectory();
        cdcOrganization=new CdcOrganization();
    }
    
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
    
    
    
}
