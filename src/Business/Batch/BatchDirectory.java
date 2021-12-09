/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Batch;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class BatchDirectory {
    private int batchId = 1001;
    ArrayList<Batch> batchDirectory;
    
    public BatchDirectory(){
        this.batchDirectory = new ArrayList<Batch>();
    }
    
    public void addBatchDirectory(Batch ba){
        this.batchDirectory.add(ba); 
    }
    public void removeBatchDirectory(Batch ba){
        this.batchDirectory.remove(ba);
    }
    
}
