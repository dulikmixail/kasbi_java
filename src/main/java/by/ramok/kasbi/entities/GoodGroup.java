package by.ramok.kasbi.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "good_group", schema = "dbo", catalog = "Ramok")
public class GoodGroup {
    private int goodGroupSysId;
    private String name;
    private String description;
    private Boolean isShow;

    @Id
    @Column(name = "good_group_sys_id")
    public int getGoodGroupSysId() {
        return goodGroupSysId;
    }

    public void setGoodGroupSysId(int goodGroupSysId) {
        this.goodGroupSysId = goodGroupSysId;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "is_show")
    public Boolean getShow() {
        return isShow;
    }

    public void setShow(Boolean show) {
        isShow = show;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodGroup goodGroup = (GoodGroup) o;
        return goodGroupSysId == goodGroup.goodGroupSysId &&
                Objects.equals(name, goodGroup.name) &&
                Objects.equals(description, goodGroup.description) &&
                Objects.equals(isShow, goodGroup.isShow);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodGroupSysId, name, description, isShow);
    }
}
