package by.ramok.kasbi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Customer {
    private Integer customerSysId;
    private String customerAbr;
    private String customerName;
    private String boosLastName;
    private String boosFirstName;
    private String boosPatronymicName;
    private String accountant;
    private String unn;
    private String okpo;
    private String zipcode;
    private String region;
    private String cityAbr;
    private String city;
    private String streetAbr;
    private String address;
    private String phone1;
    private String phone2;
    private String phone3;
    private String phone4;
    private String taxInspection;
    private Integer imnsSysId;
    private Boolean nds;
    private String bankCode;
    private String bankAccount;
    private String bankAddress;
    private String registration;
    private String branch;
    private Integer dogovor;
    private String info;
    private Boolean cto;
    private Double dolg;
    private Boolean support;
    private Integer supportSysId;
    private Date d;
    private Short alert;
    private Integer idCity;
    private Integer advertiseId;
    private Integer bankSysId;
    private Integer manager;
    private String postAdress;
    private String email;

    @Id
    @Column(name = "customer_sys_id")
    public Integer getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(Integer customerSysId) {
        this.customerSysId = customerSysId;
    }

    @Basic
    @Column(name = "customer_abr")
    public String getCustomerAbr() {
        return customerAbr;
    }

    public void setCustomerAbr(String customerAbr) {
        this.customerAbr = customerAbr;
    }

    @Basic
    @Column(name = "customer_name")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "boos_last_name")
    public String getBoosLastName() {
        return boosLastName;
    }

    public void setBoosLastName(String boosLastName) {
        this.boosLastName = boosLastName;
    }

    @Basic
    @Column(name = "boos_first_name")
    public String getBoosFirstName() {
        return boosFirstName;
    }

    public void setBoosFirstName(String boosFirstName) {
        this.boosFirstName = boosFirstName;
    }

    @Basic
    @Column(name = "boos_patronymic_name")
    public String getBoosPatronymicName() {
        return boosPatronymicName;
    }

    public void setBoosPatronymicName(String boosPatronymicName) {
        this.boosPatronymicName = boosPatronymicName;
    }

    @Basic
    @Column(name = "accountant")
    public String getAccountant() {
        return accountant;
    }

    public void setAccountant(String accountant) {
        this.accountant = accountant;
    }

    @Basic
    @Column(name = "unn")
    public String getUnn() {
        return unn;
    }

    public void setUnn(String unn) {
        this.unn = unn;
    }

    @Basic
    @Column(name = "okpo")
    public String getOkpo() {
        return okpo;
    }    @JsonIgnore


    public void setOkpo(String okpo) {
        this.okpo = okpo;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "city_abr")
    public String getCityAbr() {
        return cityAbr;
    }

    public void setCityAbr(String cityAbr) {
        this.cityAbr = cityAbr;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "street_abr")
    public String getStreetAbr() {
        return streetAbr;
    }

    public void setStreetAbr(String streetAbr) {
        this.streetAbr = streetAbr;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "phone1")
    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    @Basic
    @Column(name = "phone2")
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    @Basic
    @Column(name = "phone3")
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    @Basic
    @Column(name = "phone4")
    public String getPhone4() {
        return phone4;
    }

    public void setPhone4(String phone4) {
        this.phone4 = phone4;
    }

    @Basic
    @Column(name = "tax_inspection")
    public String getTaxInspection() {
        return taxInspection;
    }

    public void setTaxInspection(String taxInspection) {
        this.taxInspection = taxInspection;
    }

    @Basic
    @Column(name = "imns_sys_id")
    public Integer getImnsSysId() {
        return imnsSysId;
    }

    public void setImnsSysId(Integer imnsSysId) {
        this.imnsSysId = imnsSysId;
    }

    @Basic
    @Column(name = "NDS")
    public Boolean getNds() {
        return nds;
    }

    public void setNds(Boolean nds) {
        this.nds = nds;
    }

    @Basic
    @Column(name = "bank_code")
    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    @Basic
    @Column(name = "bank_account")
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Basic
    @Column(name = "bank_address")
    public String getBankAddress() {
        return bankAddress;
    }

    public void setBankAddress(String bankAddress) {
        this.bankAddress = bankAddress;
    }

    @Basic
    @Column(name = "registration")
    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    @Basic
    @Column(name = "branch")
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Basic
    @Column(name = "dogovor")
    public Integer getDogovor() {
        return dogovor;
    }

    public void setDogovor(Integer dogovor) {
        this.dogovor = dogovor;
    }

    @Basic
    @Column(name = "info")
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "cto")
    public Boolean getCto() {
        return cto;
    }

    public void setCto(Boolean cto) {
        this.cto = cto;
    }

    @Basic
    @Column(name = "dolg")
    public Double getDolg() {
        return dolg;
    }

    public void setDolg(Double dolg) {
        this.dolg = dolg;
    }

    @Basic
    @Column(name = "support")
    public Boolean getSupport() {
        return support;
    }

    public void setSupport(Boolean support) {
        this.support = support;
    }

    @Basic
    @Column(name = "support_sys_id")
    @JsonIgnore
    public Integer getSupportSysId() {
        return supportSysId;
    }

    public void setSupportSysId(Integer supportSysId) {
        this.supportSysId = supportSysId;
    }

    @Basic
    @Column(name = "d")
    @JsonIgnore
    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    @Basic
    @Column(name = "alert")
    public Short getAlert() {
        return alert;
    }

    public void setAlert(Short alert) {
        this.alert = alert;
    }

    @Basic
    @Column(name = "id_city")
    public Integer getIdCity() {
        return idCity;
    }

    public void setIdCity(Integer idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "Advertise_id")
    @JsonIgnore
    public Integer getAdvertiseId() {
        return advertiseId;
    }

    public void setAdvertiseId(Integer advertiseId) {
        this.advertiseId = advertiseId;
    }

    @Basic
    @Column(name = "bank_sys_id")
    public Integer getBankSysId() {
        return bankSysId;
    }

    public void setBankSysId(Integer bankSysId) {
        this.bankSysId = bankSysId;
    }

    @Basic
    @Column(name = "manager")
    public Integer getManager() {
        return manager;
    }

    public void setManager(Integer manager) {
        this.manager = manager;
    }

    @Basic
    @Column(name = "post_adress")
    public String getPostAdress() {
        return postAdress;
    }

    public void setPostAdress(String postAdress) {
        this.postAdress = postAdress;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerSysId, customer.customerSysId) &&
                Objects.equals(customerAbr, customer.customerAbr) &&
                Objects.equals(customerName, customer.customerName) &&
                Objects.equals(boosLastName, customer.boosLastName) &&
                Objects.equals(boosFirstName, customer.boosFirstName) &&
                Objects.equals(boosPatronymicName, customer.boosPatronymicName) &&
                Objects.equals(accountant, customer.accountant) &&
                Objects.equals(unn, customer.unn) &&
                Objects.equals(okpo, customer.okpo) &&
                Objects.equals(zipcode, customer.zipcode) &&
                Objects.equals(region, customer.region) &&
                Objects.equals(cityAbr, customer.cityAbr) &&
                Objects.equals(city, customer.city) &&
                Objects.equals(streetAbr, customer.streetAbr) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(phone1, customer.phone1) &&
                Objects.equals(phone2, customer.phone2) &&
                Objects.equals(phone3, customer.phone3) &&
                Objects.equals(phone4, customer.phone4) &&
                Objects.equals(taxInspection, customer.taxInspection) &&
                Objects.equals(imnsSysId, customer.imnsSysId) &&
                Objects.equals(nds, customer.nds) &&
                Objects.equals(bankCode, customer.bankCode) &&
                Objects.equals(bankAccount, customer.bankAccount) &&
                Objects.equals(bankAddress, customer.bankAddress) &&
                Objects.equals(registration, customer.registration) &&
                Objects.equals(branch, customer.branch) &&
                Objects.equals(dogovor, customer.dogovor) &&
                Objects.equals(info, customer.info) &&
                Objects.equals(cto, customer.cto) &&
                Objects.equals(dolg, customer.dolg) &&
                Objects.equals(support, customer.support) &&
                Objects.equals(supportSysId, customer.supportSysId) &&
                Objects.equals(d, customer.d) &&
                Objects.equals(alert, customer.alert) &&
                Objects.equals(idCity, customer.idCity) &&
                Objects.equals(advertiseId, customer.advertiseId) &&
                Objects.equals(bankSysId, customer.bankSysId) &&
                Objects.equals(manager, customer.manager) &&
                Objects.equals(postAdress, customer.postAdress) &&
                Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(customerSysId, customerAbr, customerName, boosLastName, boosFirstName, boosPatronymicName, accountant, unn, okpo, zipcode, region, cityAbr, city, streetAbr, address, phone1, phone2, phone3, phone4, taxInspection, imnsSysId, nds, bankCode, bankAccount, bankAddress, registration, branch, dogovor, info, cto, dolg, support, supportSysId, d, alert, idCity, advertiseId, bankSysId, manager, postAdress, email);
    }
}
