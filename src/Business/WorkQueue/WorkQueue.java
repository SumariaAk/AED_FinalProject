/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author akash
 */
public class WorkQueue {
    
    //Arraylist of work request
    private ArrayList<WorkRequest> workRequestList;

    //Constructor
    public WorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    //Add Order work request in list
    public Order addWorkRequestList() {
        Order temp = new Order();
        workRequestList.add(temp);
        return temp;
    }
    //Add return vaccine work request in list
    public ReturnVaccine addWorkRequestList3() {
        ReturnVaccine temp = new ReturnVaccine();
        workRequestList.add(temp);
        return temp;
    }
    //Add register vaccine work request in list
    public RegisterVaccine addWorkRequestList2(){
        RegisterVaccine temp = new RegisterVaccine();
        workRequestList.add(temp);
        return temp;
    }
    //Add work request in list
    public void addCreatedWorkrequest(WorkRequest e){
        workRequestList.add(e);
    }
     public void addCreatedWorkrequest3(ReturnVaccine e){
        workRequestList.add(e);
    }
    
}
