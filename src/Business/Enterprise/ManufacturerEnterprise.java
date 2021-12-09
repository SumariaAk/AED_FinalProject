/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Batch.BatchDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vinithiteshharsora
 */
public class ManufacturerEnterprise extends Enterprise {
    
    private BatchDirectory batchDir;
    public ManufacturerEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Manufacturer);
        batchDir = new BatchDirectory();
    }

    public BatchDirectory getBatchDir() {
        return batchDir;
    }

    public void setBatchDir(BatchDirectory batchDir) {
        this.batchDir = batchDir;
    }

    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}