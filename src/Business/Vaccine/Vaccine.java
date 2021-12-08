/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

import java.util.Date;

/**
 *
 * @author akash
 */
public class Vaccine {

    private String name;
    private float price;
    private String description;
    private Date expiryDate;
    private int batch;
    private String vaccineCode;
    private String manufacturer;
    private String code;
    public String getVaccineCode(){
        return vaccineCode;
    }
    
    public Vaccine (String name, float price, Date expiryDate, int batch, String vaccineCode, String description) {
        this.batch = batch;
        this.price = price;
        this.description = description;
        this.expiryDate = expiryDate;
        this.vaccineCode = vaccineCode;
    }
    public void setVaccineCode(String vaccineCode) {
        this.vaccineCode = vaccineCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    public Vaccine(){
    }
        
    @Override 
    public String toString(){
        return this.getName();
    }
  
}
