package by.ramok.kasbi.entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Unn {
    private String unn;
    private Integer inbase;
    private Integer in1C;
    private String name;
    private String dolg;
    private int unnSysId;

    @Basic
    @Column(name = "unn")
    public String getUnn() {
        return unn;
    }

    public void setUnn(String unn) {
        this.unn = unn;
    }

    @Basic
    @Column(name = "inbase")
    public Integer getInbase() {
        return inbase;
    }

    public void setInbase(Integer inbase) {
        this.inbase = inbase;
    }

    @Basic
    @Column(name = "in1c")
    public Integer getIn1C() {
        return in1C;
    }

    public void setIn1C(Integer in1C) {
        this.in1C = in1C;
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
    @Column(name = "dolg")
    public String getDolg() {
        return dolg;
    }

    public void setDolg(String dolg) {
        this.dolg = dolg;
    }

    @Id
    @Column(name = "unn_sys_id")
    public int getUnnSysId() {
        return unnSysId;
    }

    public void setUnnSysId(int unnSysId) {
        this.unnSysId = unnSysId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unn unn1 = (Unn) o;
        return unnSysId == unn1.unnSysId &&
                Objects.equals(unn, unn1.unn) &&
                Objects.equals(inbase, unn1.inbase) &&
                Objects.equals(in1C, unn1.in1C) &&
                Objects.equals(name, unn1.name) &&
                Objects.equals(dolg, unn1.dolg);
    }

    @Override
    public int hashCode() {

        return Objects.hash(unn, inbase, in1C, name, dolg, unnSysId);
    }
}
