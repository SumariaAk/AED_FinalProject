/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.EcoSystem;

import java.util.ArrayList;

/**
 *
 * @author vinithiteshharsora
 */
public class DeliverManDirectory {
    
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliverManDirectory(){
        deliveryManDirectory = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan add(String name, int deliveryId, int phoneNumber, String address){
        DeliveryMan deliveryMan = new DeliveryMan(deliveryId,name,phoneNumber,address);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public DeliveryMan getDeliveryManId(int index){
        return deliveryManDirectory.get(index);
    }
    
    public boolean isPhoneUnique(int phoneNumber){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getPhoneNumber()==phoneNumber){
                return false;
            }
        }
        return true;
    }
    
    public void updateDeliveryMan(String name, int deliveryId, int phoneNumber, String address){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if((deliveryMan.getDeliveryId()) == (deliveryId)){
                deliveryMan.setName(name);
                deliveryMan.setPhoneNumber(phoneNumber);
                deliveryMan.setAddress(address);
            }
        }
    }
    
    public DeliveryMan getDeliveryMan(int id){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryId() == (id)){
                return deliveryMan;
            }
        }
        return null;
    }
}
