/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author fengl
 */
@Entity
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long staffID;
    private String name;
    private String userName;
    private String password;
    private String email;
    private String phoneNumber;
    private String gender;
    private String nric;
    private String address;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date joinDate;
    private String hotelGroup;
    private String jobTitle;
    private String department;
    private int entitledLeaves;
    private boolean accountStatus;
    private String nokName;
    private String nokAddress;
    private String nokPhoneNumber;
    @OneToOne
    private Staff managerInCharge;
    @OneToMany
    private ArrayList<Leave> appliedLeave;
    @OneToMany
    private ArrayList<StaffType> accountRights;
    @OneToOne
    private WorkSchedule workSchedule;

    public Long getStaffID() {
        return staffID;
    }

    public void setStaffID(Long staffID) {
        this.staffID = staffID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (staffID != null ? staffID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.staffID == null && other.staffID != null) || (this.staffID != null && !this.staffID.equals(other.staffID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Staff[ staffID=" + staffID + " ]";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the nric
     */
    public String getNric() {
        return nric;
    }

    /**
     * @param nric the nric to set
     */
    public void setNric(String nric) {
        this.nric = nric;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return the hotelGroup
     */
    public String getHotelGroup() {
        return hotelGroup;
    }

    /**
     * @param hotelGroup the hotelGroup to set
     */
    public void setHotelGroup(String hotelGroup) {
        this.hotelGroup = hotelGroup;
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the department
     */
    public String getDepartment() {
        return department;
    }

    /**
     * @param department the department to set
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * @return the managerInCharge
     */
    public Staff getManagerInCharge() {
        return managerInCharge;
    }

    /**
     * @param managerInCharge the managerInCharge to set
     */
    public void setManagerInCharge(Staff managerInCharge) {
        this.managerInCharge = managerInCharge;
    }

    /**
     * @return the entitiledLeaves
     */
    public int getEntitledLeaves() {
        return entitledLeaves;
    }

    /**
     * @param entitiledLeaves the entitiledLeaves to set
     */
    public void setEntitledLeaves(int entitledLeaves) {
        this.entitledLeaves = entitledLeaves;
    }

    /**
     * @return the appliedLeave
     */
    public ArrayList<Leave> getAppliedLeave() {
        return appliedLeave;
    }

    /**
     * @param appliedLeave the appliedLeave to set
     */
    public void setAppliedLeave(ArrayList<Leave> appliedLeave) {
        this.appliedLeave = appliedLeave;
    }

    /**
     * @return the accountStatus
     */
    public boolean getAccountStatus() {
        return accountStatus;
    }

    /**
     * @param accountStatus the accountStatus to set
     */
    public void setAccountStatus(boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    /**
     * @return the accountRights
     */
    public ArrayList<StaffType> getAccountRights() {
        return accountRights;
    }

    /**
     * @param accountRights the accountRights to set
     */
    public void setAccountRights(ArrayList<StaffType> accountRights) {
        this.accountRights = accountRights;
    }

    /**
     * @return the nokName
     */
    public String getNokName() {
        return nokName;
    }

    /**
     * @param nokName the nokName to set
     */
    public void setNokName(String nokName) {
        this.nokName = nokName;
    }

    /**
     * @return the nokAddress
     */
    public String getNokAddress() {
        return nokAddress;
    }

    /**
     * @param nokAddress the nokAddress to set
     */
    public void setNokAddress(String nokAddress) {
        this.nokAddress = nokAddress;
    }

    /**
     * @return the nokPhoneNumber
     */
    public String getNokPhoneNumber() {
        return nokPhoneNumber;
    }

    /**
     * @param nokPhoneNumber the nokPhoneNumber to set
     */
    public void setNokPhoneNumber(String nokPhoneNumber) {
        this.nokPhoneNumber = nokPhoneNumber;
    }

    public WorkSchedule getWorkSchedule() {
        return workSchedule;
    }

    public void setWorkSchedule(WorkSchedule workSchedule) {
        this.workSchedule = workSchedule;
    }

}
