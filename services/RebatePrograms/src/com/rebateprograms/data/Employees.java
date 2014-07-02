
package com.rebateprograms.data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


/**
 *  RebatePrograms.Employees
 *  07/31/2013 09:43:25
 * 
 */
public class Employees {

    private Integer id;
    private EmployeeTypes employeeTypes;
    private Boolean active;
    private String userName;
    private Integer privledges;
    private String initials;
    private String name;
    private String phone;
    private String extension;
    private String email;
    private BigDecimal rate;
    private String modifiedUser;
    private Date modifiedDate;
    private String webuipassword;
    private String title;
    private String personalEmail;
    private String homePhone;
    private String cell;
    private String messengerName;
    private String messengerService;
    private String address;
    private String apartment;
    private String city;
    private String state;
    private String zip;
    private String emergencyName;
    private String emergencyNumber;
    private String emergencyRelation;
    private Boolean currentEmployee;
    private Integer clientId;
    private String role;
    private Integer tenantid;
    private Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses = new HashSet<com.rebateprograms.data.ZipUtilities>();
    private Set<com.rebateprograms.data.Clients> clientsesForRaemployeeId = new HashSet<com.rebateprograms.data.Clients>();
    private Set<com.rebateprograms.data.Clients> clientsesForCeemployeeId = new HashSet<com.rebateprograms.data.Clients>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EmployeeTypes getEmployeeTypes() {
        return employeeTypes;
    }

    public void setEmployeeTypes(EmployeeTypes employeeTypes) {
        this.employeeTypes = employeeTypes;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getPrivledges() {
        return privledges;
    }

    public void setPrivledges(Integer privledges) {
        this.privledges = privledges;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getModifiedUser() {
        return modifiedUser;
    }

    public void setModifiedUser(String modifiedUser) {
        this.modifiedUser = modifiedUser;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getWebuipassword() {
        return webuipassword;
    }

    public void setWebuipassword(String webuipassword) {
        this.webuipassword = webuipassword;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPersonalEmail() {
        return personalEmail;
    }

    public void setPersonalEmail(String personalEmail) {
        this.personalEmail = personalEmail;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCell() {
        return cell;
    }

    public void setCell(String cell) {
        this.cell = cell;
    }

    public String getMessengerName() {
        return messengerName;
    }

    public void setMessengerName(String messengerName) {
        this.messengerName = messengerName;
    }

    public String getMessengerService() {
        return messengerService;
    }

    public void setMessengerService(String messengerService) {
        this.messengerService = messengerService;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmergencyName() {
        return emergencyName;
    }

    public void setEmergencyName(String emergencyName) {
        this.emergencyName = emergencyName;
    }

    public String getEmergencyNumber() {
        return emergencyNumber;
    }

    public void setEmergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
    }

    public String getEmergencyRelation() {
        return emergencyRelation;
    }

    public void setEmergencyRelation(String emergencyRelation) {
        this.emergencyRelation = emergencyRelation;
    }

    public Boolean getCurrentEmployee() {
        return currentEmployee;
    }

    public void setCurrentEmployee(Boolean currentEmployee) {
        this.currentEmployee = currentEmployee;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getTenantid() {
        return tenantid;
    }

    public void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    public Set<com.rebateprograms.data.ZipUtilities> getZipUtilitieses() {
        return zipUtilitieses;
    }

    public void setZipUtilitieses(Set<com.rebateprograms.data.ZipUtilities> zipUtilitieses) {
        this.zipUtilitieses = zipUtilitieses;
    }

    public Set<com.rebateprograms.data.Clients> getClientsesForRaemployeeId() {
        return clientsesForRaemployeeId;
    }

    public void setClientsesForRaemployeeId(Set<com.rebateprograms.data.Clients> clientsesForRaemployeeId) {
        this.clientsesForRaemployeeId = clientsesForRaemployeeId;
    }

    public Set<com.rebateprograms.data.Clients> getClientsesForCeemployeeId() {
        return clientsesForCeemployeeId;
    }

    public void setClientsesForCeemployeeId(Set<com.rebateprograms.data.Clients> clientsesForCeemployeeId) {
        this.clientsesForCeemployeeId = clientsesForCeemployeeId;
    }

}
