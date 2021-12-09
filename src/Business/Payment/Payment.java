/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Payment;

/**
 *
 * @author akash
 */
public class Payment {
    //Payment details
    private String paymentId;
    private double amount;
    private String HospitalName;
    private String LastcardDetail;
    private boolean successful;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getHospitalName() {
        return HospitalName;
    }

    public void setHospitalName(String HospitalName) {
        this.HospitalName = HospitalName;
    }

    public String getLastcardDetail() {
        return LastcardDetail;
    }

    public void setLastcardDetail(String LastcardDetail) {
        this.LastcardDetail = LastcardDetail;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
    
    public Payment(){
        
    }
    
}
