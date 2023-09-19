/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author abhin
 */
public class Patient {

//    date of last visit to the doctor, date of next appointment, allergies (“yes” or “no”),  
//    onMedication (yes or no). etc. insurance coverage, etc. Personal info is kept in the person object.

    
    private String patientID;
    private String assignedDoctorID;
    private Date previousVisit;
    private Date nextAppointment;
    private boolean allergic;
    private boolean medication;
    private String insuranceNo;

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getAssignedDoctorID() {
        return assignedDoctorID;
    }

    public void setAssignedDoctorID(String assignedDoctorID) {
        this.assignedDoctorID = assignedDoctorID;
    }

    public Date getPreviousVisit() {
        return previousVisit;
    }

    public void setPreviousVisit(Date previousVisit) {
        this.previousVisit = previousVisit;
    }

    public Date getNextAppointment() {
        return nextAppointment;
    }

    public void setNextAppointment(Date nextAppointment) {
        this.nextAppointment = nextAppointment;
    }

    public boolean isAllergic() {
        return allergic;
    }

    public void setAllergic(boolean allergic) {
        this.allergic = allergic;
    }

    public boolean isMedication() {
        return medication;
    }

    public void setMedication(boolean medication) {
        this.medication = medication;
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo;
    }
    
    
    
}
