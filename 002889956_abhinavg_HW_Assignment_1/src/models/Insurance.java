/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author abhin
 */
public class Insurance {
    
    private String insuranceID;
    private String corporateID;
    private String address;
    private float yearlyPremium;
    private float deductable;
    private String benefits;

    public String getInsuranceID() {
        return insuranceID;
    }

    public void setInsuranceID(String insuranceID) {
        this.insuranceID = insuranceID;
    }

    public String getCorporateID() {
        return corporateID;
    }

    public void setCorporateID(String corporateID) {
        this.corporateID = corporateID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getYearlyPremium() {
        return yearlyPremium;
    }

    public void setYearlyPremium(float yearlyPremium) {
        this.yearlyPremium = yearlyPremium;
    }

    public float getDeductable() {
        return deductable;
    }

    public void setDeductable(float deductable) {
        this.deductable = deductable;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }
    
    
}
