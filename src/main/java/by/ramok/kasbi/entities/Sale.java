package by.ramok.kasbi.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Sale {
    private int saleSysId;
    private int customerSysId;
    private Date saleDate;
    private Short state;
    private Short type;
    private String documentPath;
    private String info;
    private Integer salerSysId;
    private String dogovor;
    private String proxy;
    private Date d;
    private int firmSysId;
    private Long id1C;
    private Integer buhSysId;

    @Id
    @Column(name = "sale_sys_id")
    public int getSaleSysId() {
        return saleSysId;
    }

    public void setSaleSysId(int saleSysId) {
        this.saleSysId = saleSysId;
    }

    @Basic
    @Column(name = "customer_sys_id")
    public int getCustomerSysId() {
        return customerSysId;
    }

    public void setCustomerSysId(int customerSysId) {
        this.customerSysId = customerSysId;
    }

    @Basic
    @Column(name = "sale_date")
    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    @Basic
    @Column(name = "state")
    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    @Basic
    @Column(name = "type")
    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    @Basic
    @Column(name = "document_path")
    public String getDocumentPath() {
        return documentPath;
    }

    public void setDocumentPath(String documentPath) {
        this.documentPath = documentPath;
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
    @Column(name = "saler_sys_id")
    public Integer getSalerSysId() {
        return salerSysId;
    }

    public void setSalerSysId(Integer salerSysId) {
        this.salerSysId = salerSysId;
    }

    @Basic
    @Column(name = "dogovor")
    public String getDogovor() {
        return dogovor;
    }

    public void setDogovor(String dogovor) {
        this.dogovor = dogovor;
    }

    @Basic
    @Column(name = "proxy")
    public String getProxy() {
        return proxy;
    }

    public void setProxy(String proxy) {
        this.proxy = proxy;
    }

    @Basic
    @Column(name = "d")
    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    @Basic
    @Column(name = "firm_sys_id")
    public int getFirmSysId() {
        return firmSysId;
    }

    public void setFirmSysId(int firmSysId) {
        this.firmSysId = firmSysId;
    }

    @Basic
    @Column(name = "id1c")
    public Long getId1C() {
        return id1C;
    }

    public void setId1C(Long id1C) {
        this.id1C = id1C;
    }

    @Basic
    @Column(name = "buh_sys_id")
    public Integer getBuhSysId() {
        return buhSysId;
    }

    public void setBuhSysId(Integer buhSysId) {
        this.buhSysId = buhSysId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sale sale = (Sale) o;
        return saleSysId == sale.saleSysId &&
                customerSysId == sale.customerSysId &&
                firmSysId == sale.firmSysId &&
                Objects.equals(saleDate, sale.saleDate) &&
                Objects.equals(state, sale.state) &&
                Objects.equals(type, sale.type) &&
                Objects.equals(documentPath, sale.documentPath) &&
                Objects.equals(info, sale.info) &&
                Objects.equals(salerSysId, sale.salerSysId) &&
                Objects.equals(dogovor, sale.dogovor) &&
                Objects.equals(proxy, sale.proxy) &&
                Objects.equals(d, sale.d) &&
                Objects.equals(id1C, sale.id1C) &&
                Objects.equals(buhSysId, sale.buhSysId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(saleSysId, customerSysId, saleDate, state, type, documentPath, info, salerSysId, dogovor, proxy, d, firmSysId, id1C, buhSysId);
    }
}
