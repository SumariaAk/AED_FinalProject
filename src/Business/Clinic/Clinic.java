/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Clinic;

import Business.Vaccine.AdministeredVaccineDetails;
import Business.Vaccine.VaccineDetails;
import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class Clinic {

    private String clinicName;
    private boolean registered;
    private ArrayList<VaccineDetails> vaccineDetails;
    private ArrayList<AdministeredVaccineDetails> administeredVaccineDetails;

    public Clinic() {
        registered = false;
        vaccineDetails = new ArrayList<>();
        administeredVaccineDetails = new ArrayList<>();

    }    
    
    
    public ArrayList<VaccineDetails> getVaccineInventoryClinic() {
        return vaccineDetails;
    }

    public ArrayList<AdministeredVaccineDetails> getAdministeredVaccineList() {
        return administeredVaccineDetails;
    }

    public void setAdministeredVaccineList(ArrayList<AdministeredVaccineDetails> administeredVaccineDetails) {
        this.administeredVaccineDetails = administeredVaccineDetails;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public VaccineDetails addVaccine(VaccineDetails vaccine) {
        vaccineDetails.add(vaccine);
        return vaccine;

    }

    public VaccineDetails addNewVaccineDetails() {
        VaccineDetails details = new VaccineDetails();
        vaccineDetails.add(details);
        return details;

    }

    public void removeVaccine(VaccineDetails vaccine) {

        vaccineDetails.remove(vaccine);

    }

    public AdministeredVaccineDetails addNewAdministeredVaccine() {
        AdministeredVaccineDetails vaccineDetails = new AdministeredVaccineDetails();
        administeredVaccineDetails.add(vaccineDetails);
        return vaccineDetails;

    }

    public int getTotalAdministeredVaccines() {
        int total = 0;
        if (administeredVaccineDetails != null) {
            for (AdministeredVaccineDetails vaccine : administeredVaccineDetails) {
                total = total + 1;
            }

        }

        return total;

    }

    public int getTotalVaccinesFailed() {
        int total = 0;
        if (administeredVaccineDetails != null) {
            for (AdministeredVaccineDetails vaccine : administeredVaccineDetails) {
                if (vaccine != null) {
                    if (vaccine.getInjectionStatus() != null) {
                        if (vaccine.getInjectionStatus().equalsIgnoreCase("Fail")) {
                            total = total + 1;
                        }
                    }
                }
            }

        }

        return total;

    }
    
    public int getTotalStoredVaccines() {
        int total = 0;
        if (vaccineDetails != null) {
            for (VaccineDetails vaccine : vaccineDetails) {
                total = total + vaccine.getAvailablity();
            }
            total = total + getTotalAdministeredVaccines();
        }

        return total;

    }

    @Override
    public String toString() {
        return clinicName;
    }

}
