package by.ramok.kasbi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "good_type", schema = "dbo", catalog = "Ramok")
public class GoodType {
    private Integer goodTypeSysId;
    private String name;
    private Boolean isCashregister;
    private String paramStrDescription;
    private String paramNumDescription;
    private String info;
    private Boolean nadbavka;
    private Boolean allowCto;
    private Integer garantia;
    private Integer goodGroupSysId;
    private String country;
    private String priceTo;
    private String artikul;
    private Long idp;

    @Id
    @Column(name = "good_type_sys_id")
    public Integer getGoodTypeSysId() {
        return goodTypeSysId;
    }

    public void setGoodTypeSysId(Integer goodTypeSysId) {
        this.goodTypeSysId = goodTypeSysId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "is_cashregister")
    public Boolean getCashregister() {
        return isCashregister;
    }

    public void setCashregister(Boolean cashregister) {
        isCashregister = cashregister;
    }

    @Basic
    @Column(name = "param_str_description")
    @JsonIgnore
    public String getParamStrDescription() {
        return paramStrDescription;
    }

    public void setParamStrDescription(String paramStrDescription) {
        this.paramStrDescription = paramStrDescription;
    }

    @Basic
    @Column(name = "param_num_description")
    @JsonIgnore
    public String getParamNumDescription() {
        return paramNumDescription;
    }

    public void setParamNumDescription(String paramNumDescription) {
        this.paramNumDescription = paramNumDescription;
    }

    @Basic
    @Column(name = "info")
    @JsonIgnore
    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Basic
    @Column(name = "nadbavka")
    @JsonIgnore
    public Boolean getNadbavka() {
        return nadbavka;
    }

    public void setNadbavka(Boolean nadbavka) {
        this.nadbavka = nadbavka;
    }

    @Basic
    @Column(name = "allowCTO")
    @JsonIgnore
    public Boolean getAllowCto() {
        return allowCto;
    }

    public void setAllowCto(Boolean allowCto) {
        this.allowCto = allowCto;
    }

    @Basic
    @Column(name = "garantia")
    public Integer getGarantia() {
        return garantia;
    }

    public void setGarantia(Integer garantia) {
        this.garantia = garantia;
    }

    @Basic
    @Column(name = "good_group_sys_id")
    public Integer getGoodGroupSysId() {
        return goodGroupSysId;
    }

    public void setGoodGroupSysId(Integer goodGroupSysId) {
        this.goodGroupSysId = goodGroupSysId;
    }

    @Basic
    @Column(name = "country")
    @JsonIgnore
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "price_to")
    @JsonIgnore
    public String getPriceTo() {
        return priceTo;
    }

    public void setPriceTo(String priceTo) {
        this.priceTo = priceTo;
    }

    @Basic
    @Column(name = "artikul")
    public String getArtikul() {
        return artikul;
    }

    public void setArtikul(String artikul) {
        this.artikul = artikul;
    }

    @Basic
    @Column(name = "idp")
    @JsonIgnore
    public Long getIdp() {
        return idp;
    }

    public void setIdp(Long idp) {
        this.idp = idp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodType goodType = (GoodType) o;
        return Objects.equals(goodTypeSysId, goodType.goodTypeSysId) &&
                Objects.equals(name, goodType.name) &&
                Objects.equals(isCashregister, goodType.isCashregister) &&
                Objects.equals(paramStrDescription, goodType.paramStrDescription) &&
                Objects.equals(paramNumDescription, goodType.paramNumDescription) &&
                Objects.equals(info, goodType.info) &&
                Objects.equals(nadbavka, goodType.nadbavka) &&
                Objects.equals(allowCto, goodType.allowCto) &&
                Objects.equals(garantia, goodType.garantia) &&
                Objects.equals(goodGroupSysId, goodType.goodGroupSysId) &&
                Objects.equals(country, goodType.country) &&
                Objects.equals(priceTo, goodType.priceTo) &&
                Objects.equals(artikul, goodType.artikul) &&
                Objects.equals(idp, goodType.idp);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodTypeSysId, name, isCashregister, paramStrDescription, paramNumDescription, info, nadbavka, allowCto, garantia, goodGroupSysId, country, priceTo, artikul, idp);
    }
}
