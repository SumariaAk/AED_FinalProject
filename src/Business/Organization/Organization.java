/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public abstract class Organization {
    private String OrganizationName;
    private int OrganizationId;
    private static int counter = 1001;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    
    public enum Type{
        
        Admin("Admin Organization"),
        Inventory("Inventory Organization"),
        Lab("Lab Organization"),
        Doctor("Doctor Organization"),
        Lhd("Lhd Organization"),
        Transportation("Transportation Organization"),
        Dealer("Dealer Organization"),
        Logistic("Logistic Organization"),
        Hospital("Hospital Organization"),
        Cdc("Cdc Organization");
        
        private final String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
    }
        
    public Organization(String name) {
        this.OrganizationName = name;
        this.employeeDirectory = new EmployeeDirectory();
        this.userAccountDirectory = new UserAccountDirectory();
        this.OrganizationId = counter++;
    }

    public String getOrganizationName() {
        return OrganizationName;
    }

    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    public int getOrganizationId() {
        return OrganizationId;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
    
}
