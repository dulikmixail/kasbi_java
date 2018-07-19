package by.ramok.kasbi.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GoodPK implements Serializable {
    private int goodSysId;
    private short state;
    private int goodKey;

    @Column(name = "good_sys_id")
    @Id
    public int getGoodSysId() {
        return goodSysId;
    }

    public void setGoodSysId(int goodSysId) {
        this.goodSysId = goodSysId;
    }

    @Column(name = "state")
    @Id
    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    @Column(name = "good_key")
    @Id
    public int getGoodKey() {
        return goodKey;
    }

    public void setGoodKey(int goodKey) {
        this.goodKey = goodKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodPK goodPK = (GoodPK) o;
        return goodSysId == goodPK.goodSysId &&
                state == goodPK.state &&
                goodKey == goodPK.goodKey;
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodSysId, state, goodKey);
    }
}
