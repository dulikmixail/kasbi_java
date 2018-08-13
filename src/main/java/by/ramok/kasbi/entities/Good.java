package by.ramok.kasbi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@IdClass(GoodPK.class)
public class Good {
    private Integer goodSysId;
    private Integer goodTypeSysId;
    private Integer deliverySysId;
    private Integer saleSysId;
    private Double price;
    private String numCashregister;
    private String numControlReestr;
    private String numControlPzu;
    private String numControlMfp;
    private String numControlCto;
    private String numControlCp;
    private String numControlCto2;
    private String paramStr;
    private Integer paramNum;
    private String setPlace;
    private String kassir1;
    private String kassir2;
    private Short state;
    private String info;
    private String pricelistSysId;
    private Integer goodKey;
    private Integer worker;
    private Timestamp d;
    private Boolean support;
    private Integer placeRnId;
    private Integer employeeCto;
    private Boolean confirmed;
    private Boolean inrepair;

    @Id
    @Column(name = "good_sys_id")
    public Integer getGoodSysId() {
        return goodSysId;
    }

    public void setGoodSysId(Integer goodSysId) {
        this.goodSysId = goodSysId;
    }

    @Basic
    @Column(name = "good_type_sys_id")

    public Integer getGoodTypeSysId() {
        return goodTypeSysId;
    }

    public void setGoodTypeSysId(Integer goodTypeSysId) {
        this.goodTypeSysId = goodTypeSysId;
    }

    @Basic
    @Column(name = "delivery_sys_id")
    public Integer getDeliverySysId() {
        return deliverySysId;
    }

    public void setDeliverySysId(Integer deliverySysId) {
        this.deliverySysId = deliverySysId;
    }

    @Basic
    @Column(name = "sale_sys_id")
    public Integer getSaleSysId() {
        return saleSysId;
    }

    public void setSaleSysId(Integer saleSysId) {
        this.saleSysId = saleSysId;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "num_cashregister")
    public String getNumCashregister() {
        return numCashregister;
    }

    public void setNumCashregister(String numCashregister) {
        this.numCashregister = numCashregister;
    }

    @Basic
    @Column(name = "num_control_reestr")
    public String getNumControlReestr() {
        return numControlReestr;
    }

    public void setNumControlReestr(String numControlReestr) {
        this.numControlReestr = numControlReestr;
    }

    @Basic
    @Column(name = "num_control_pzu")
    public String getNumControlPzu() {
        return numControlPzu;
    }

    public void setNumControlPzu(String numControlPzu) {
        this.numControlPzu = numControlPzu;
    }

    @Basic
    @Column(name = "num_control_mfp")
    public String getNumControlMfp() {
        return numControlMfp;
    }

    public void setNumControlMfp(String numControlMfp) {
        this.numControlMfp = numControlMfp;
    }

    @Basic
    @Column(name = "num_control_cto")
    public String getNumControlCto() {
        return numControlCto;
    }

    public void setNumControlCto(String numControlCto) {
        this.numControlCto = numControlCto;
    }

    @Basic
    @Column(name = "num_control_cp")
    public String getNumControlCp() {
        return numControlCp;
    }

    public void setNumControlCp(String numControlCp) {
        this.numControlCp = numControlCp;
    }

    @Basic
    @Column(name = "num_control_cto2")
    public String getNumControlCto2() {
        return numControlCto2;
    }

    public void setNumControlCto2(String numControlCto2) {
        this.numControlCto2 = numControlCto2;
    }

    @Basic
    @Column(name = "param_str")
    @JsonIgnore
    public String getParamStr() {
        return paramStr;
    }

    public void setParamStr(String paramStr) {
        this.paramStr = paramStr;
    }

    @Basic
    @Column(name = "param_num")
    public Integer getParamNum() {
        return paramNum;
    }

    public void setParamNum(Integer paramNum) {
        this.paramNum = paramNum;
    }

    @Basic
    @Column(name = "set_place")
    public String getSetPlace() {
        return setPlace;
    }

    public void setSetPlace(String setPlace) {
        this.setPlace = setPlace;
    }

    @Basic
    @Column(name = "kassir1")
    public String getKassir1() {
        return kassir1;
    }

    public void setKassir1(String kassir1) {
        this.kassir1 = kassir1;
    }

    @Basic
    @Column(name = "kassir2")
    public String getKassir2() {
        return kassir2;
    }

    public void setKassir2(String kassir2) {
        this.kassir2 = kassir2;
    }

    @Id
    @Column(name = "state")
    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
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
    @Column(name = "pricelist_sys_id")
    public String getPricelistSysId() {
        return pricelistSysId;
    }

    public void setPricelistSysId(String pricelistSysId) {
        this.pricelistSysId = pricelistSysId;
    }

    @Id
    @Column(name = "good_key")
    public Integer getGoodKey() {
        return goodKey;
    }

    public void setGoodKey(Integer goodKey) {
        this.goodKey = goodKey;
    }

    @Basic
    @Column(name = "worker")
    public Integer getWorker() {
        return worker;
    }

    public void setWorker(Integer worker) {
        this.worker = worker;
    }

    @Basic
    @Column(name = "d")
    public Timestamp getD() {
        return d;
    }

    public void setD(Timestamp d) {
        this.d = d;
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
    @Column(name = "place_rn_id")
    public Integer getPlaceRnId() {
        return placeRnId;
    }

    public void setPlaceRnId(Integer placeRnId) {
        this.placeRnId = placeRnId;
    }

    @Basic
    @Column(name = "employee_cto")
    public Integer getEmployeeCto() {
        return employeeCto;
    }

    public void setEmployeeCto(Integer employeeCto) {
        this.employeeCto = employeeCto;
    }

    @Basic
    @Column(name = "confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    @Basic
    @Column(name = "inrepair")
    public Boolean getInrepair() {
        return inrepair;
    }

    public void setInrepair(Boolean inrepair) {
        this.inrepair = inrepair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Good good = (Good) o;
        return Objects.equals(goodSysId, good.goodSysId) &&
                Objects.equals(goodTypeSysId, good.goodTypeSysId) &&
                Objects.equals(deliverySysId, good.deliverySysId) &&
                Objects.equals(saleSysId, good.saleSysId) &&
                Objects.equals(price, good.price) &&
                Objects.equals(numCashregister, good.numCashregister) &&
                Objects.equals(numControlReestr, good.numControlReestr) &&
                Objects.equals(numControlPzu, good.numControlPzu) &&
                Objects.equals(numControlMfp, good.numControlMfp) &&
                Objects.equals(numControlCto, good.numControlCto) &&
                Objects.equals(numControlCp, good.numControlCp) &&
                Objects.equals(numControlCto2, good.numControlCto2) &&
                Objects.equals(paramStr, good.paramStr) &&
                Objects.equals(paramNum, good.paramNum) &&
                Objects.equals(setPlace, good.setPlace) &&
                Objects.equals(kassir1, good.kassir1) &&
                Objects.equals(kassir2, good.kassir2) &&
                Objects.equals(state, good.state) &&
                Objects.equals(info, good.info) &&
                Objects.equals(pricelistSysId, good.pricelistSysId) &&
                Objects.equals(goodKey, good.goodKey) &&
                Objects.equals(worker, good.worker) &&
                Objects.equals(d, good.d) &&
                Objects.equals(support, good.support) &&
                Objects.equals(placeRnId, good.placeRnId) &&
                Objects.equals(employeeCto, good.employeeCto) &&
                Objects.equals(confirmed, good.confirmed) &&
                Objects.equals(inrepair, good.inrepair);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodSysId, goodTypeSysId, deliverySysId, saleSysId, price, numCashregister, numControlReestr, numControlPzu, numControlMfp, numControlCto, numControlCp, numControlCto2, paramStr, paramNum, setPlace, kassir1, kassir2, state, info, pricelistSysId, goodKey, worker, d, support, placeRnId, employeeCto, confirmed, inrepair);
    }
}
