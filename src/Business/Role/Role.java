/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

/**
 *
 * @author akash
 */
public class Role {
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        InventoryManager("Inventory Manager"),
        LabAssistant("Lab Assistant"),
        LHDLead("LHD Lead"),
        DeliveryPerson("Delivery Person"),
        Provider("Provider"),
        Logistics("Logistics"),
        DeliveryManger("Delivery Manager");
        
        private final String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return this.value;
        }
    }
}