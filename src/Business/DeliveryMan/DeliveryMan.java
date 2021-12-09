/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;


/**
 *
 * @author vinithiteshharsora
 */
public class DeliveryMan {
    
    
    private int deliveryId;
    private String name;
    private int phoneNumber;
    private String address;

    
    public DeliveryMan(int deliveryId, String name, int phoneNumber, String address) {
        this.deliveryId = deliveryId;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }


    public int getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(int deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    
    }
    
}
