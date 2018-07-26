package by.ramok.kasbi.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GoodPK implements Serializable {
    private Integer goodSysId;
    private Short state;
    private Integer goodKey;

    @Column(name = "good_sys_id")
    @Id
    public Integer getGoodSysId() {
        return goodSysId;
    }

    public void setGoodSysId(Integer goodSysId) {
        this.goodSysId = goodSysId;
    }

    @Column(name = "state")
    @Id
    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    @Column(name = "good_key")
    @Id
    public Integer getGoodKey() {
        return goodKey;
    }

    public void setGoodKey(Integer goodKey) {
        this.goodKey = goodKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodPK goodPK = (GoodPK) o;
        return Objects.equals(goodSysId, goodPK.goodSysId) &&
                Objects.equals(state, goodPK.state) &&
                Objects.equals(goodKey, goodPK.goodKey);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodSysId, state, goodKey);
    }
}
