package by.ramok.kasbi.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "cash_history", schema = "dbo", catalog = "Ramok")
public class CashHistory {
    private int sysId;
    private Integer goodSysId;
    private Integer ownerSysId;
    private String markaCtoIn;
    private String markaCtoOut;
    private String markaPzuIn;
    private String markaPzuOut;
    private String markaMfpIn;
    private String markaMfpOut;
    private String markaReestrIn;
    private String markaReestrOut;
    private String markaCto2In;
    private String markaCto2Out;
    private String markaCpIn;
    private String markaCpOut;
    private Integer zreportIn;
    private Integer zreportOut;
    private Long itogIn;
    private Long itogOut;
    private Integer state;
    private String info;
    private Integer executor;
    private Timestamp changeStateDate;
    private Date startDate;
    private Integer period;
    private Timestamp dismissalDate;
    private Timestamp supportDate;
    private String details;
    private Timestamp repairdateIn;
    private Timestamp repairdateOut;
    private Boolean deleted;
    private Double summa;
    private String akt;
    private Integer saleId;
    private String repairInfo;
    private Integer updateUserId;
    private Timestamp updateDate;
    private Boolean garantia;
    private Boolean workNotCall;
    private String repareInInfo;

    @Id
    @Column(name = "sys_id")
    public int getSysId() {
        return sysId;
    }

    public void setSysId(int sysId) {
        this.sysId = sysId;
    }

    @Basic
    @Column(name = "good_sys_id")
    public Integer getGoodSysId() {
        return goodSysId;
    }

    public void setGoodSysId(Integer goodSysId) {
        this.goodSysId = goodSysId;
    }

    @Basic
    @Column(name = "owner_sys_id")
    public Integer getOwnerSysId() {
        return ownerSysId;
    }

    public void setOwnerSysId(Integer ownerSysId) {
        this.ownerSysId = ownerSysId;
    }

    @Basic
    @Column(name = "marka_cto_in")
    public String getMarkaCtoIn() {
        return markaCtoIn;
    }

    public void setMarkaCtoIn(String markaCtoIn) {
        this.markaCtoIn = markaCtoIn;
    }

    @Basic
    @Column(name = "marka_cto_out")
    public String getMarkaCtoOut() {
        return markaCtoOut;
    }

    public void setMarkaCtoOut(String markaCtoOut) {
        this.markaCtoOut = markaCtoOut;
    }

    @Basic
    @Column(name = "marka_pzu_in")
    public String getMarkaPzuIn() {
        return markaPzuIn;
    }

    public void setMarkaPzuIn(String markaPzuIn) {
        this.markaPzuIn = markaPzuIn;
    }

    @Basic
    @Column(name = "marka_pzu_out")
    public String getMarkaPzuOut() {
        return markaPzuOut;
    }

    public void setMarkaPzuOut(String markaPzuOut) {
        this.markaPzuOut = markaPzuOut;
    }

    @Basic
    @Column(name = "marka_mfp_in")
    public String getMarkaMfpIn() {
        return markaMfpIn;
    }

    public void setMarkaMfpIn(String markaMfpIn) {
        this.markaMfpIn = markaMfpIn;
    }

    @Basic
    @Column(name = "marka_mfp_out")
    public String getMarkaMfpOut() {
        return markaMfpOut;
    }

    public void setMarkaMfpOut(String markaMfpOut) {
        this.markaMfpOut = markaMfpOut;
    }

    @Basic
    @Column(name = "marka_reestr_in")
    public String getMarkaReestrIn() {
        return markaReestrIn;
    }

    public void setMarkaReestrIn(String markaReestrIn) {
        this.markaReestrIn = markaReestrIn;
    }

    @Basic
    @Column(name = "marka_reestr_out")
    public String getMarkaReestrOut() {
        return markaReestrOut;
    }

    public void setMarkaReestrOut(String markaReestrOut) {
        this.markaReestrOut = markaReestrOut;
    }

    @Basic
    @Column(name = "marka_cto2_in")
    public String getMarkaCto2In() {
        return markaCto2In;
    }

    public void setMarkaCto2In(String markaCto2In) {
        this.markaCto2In = markaCto2In;
    }

    @Basic
    @Column(name = "marka_cto2_out")
    public String getMarkaCto2Out() {
        return markaCto2Out;
    }

    public void setMarkaCto2Out(String markaCto2Out) {
        this.markaCto2Out = markaCto2Out;
    }

    @Basic
    @Column(name = "marka_cp_in")
    public String getMarkaCpIn() {
        return markaCpIn;
    }

    public void setMarkaCpIn(String markaCpIn) {
        this.markaCpIn = markaCpIn;
    }

    @Basic
    @Column(name = "marka_cp_out")
    public String getMarkaCpOut() {
        return markaCpOut;
    }

    public void setMarkaCpOut(String markaCpOut) {
        this.markaCpOut = markaCpOut;
    }

    @Basic
    @Column(name = "zreport_in")
    public Integer getZreportIn() {
        return zreportIn;
    }

    public void setZreportIn(Integer zreportIn) {
        this.zreportIn = zreportIn;
    }

    @Basic
    @Column(name = "zreport_out")
    public Integer getZreportOut() {
        return zreportOut;
    }

    public void setZreportOut(Integer zreportOut) {
        this.zreportOut = zreportOut;
    }

    @Basic
    @Column(name = "itog_in")
    public Long getItogIn() {
        return itogIn;
    }

    public void setItogIn(Long itogIn) {
        this.itogIn = itogIn;
    }

    @Basic
    @Column(name = "itog_out")
    public Long getItogOut() {
        return itogOut;
    }

    public void setItogOut(Long itogOut) {
        this.itogOut = itogOut;
    }

    @Basic
    @Column(name = "state")
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
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
    @Column(name = "executor")
    public Integer getExecutor() {
        return executor;
    }

    public void setExecutor(Integer executor) {
        this.executor = executor;
    }

    @Basic
    @Column(name = "change_state_date")
    public Timestamp getChangeStateDate() {
        return changeStateDate;
    }

    public void setChangeStateDate(Timestamp changeStateDate) {
        this.changeStateDate = changeStateDate;
    }

    @Basic
    @Column(name = "start_date")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "period")
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Basic
    @Column(name = "dismissal_date")
    public Timestamp getDismissalDate() {
        return dismissalDate;
    }

    public void setDismissalDate(Timestamp dismissalDate) {
        this.dismissalDate = dismissalDate;
    }

    @Basic
    @Column(name = "support_date")
    public Timestamp getSupportDate() {
        return supportDate;
    }

    public void setSupportDate(Timestamp supportDate) {
        this.supportDate = supportDate;
    }

    @Basic
    @Column(name = "details")
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Basic
    @Column(name = "repairdate_in")
    public Timestamp getRepairdateIn() {
        return repairdateIn;
    }

    public void setRepairdateIn(Timestamp repairdateIn) {
        this.repairdateIn = repairdateIn;
    }

    @Basic
    @Column(name = "repairdate_out")
    public Timestamp getRepairdateOut() {
        return repairdateOut;
    }

    public void setRepairdateOut(Timestamp repairdateOut) {
        this.repairdateOut = repairdateOut;
    }

    @Basic
    @Column(name = "deleted")
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "summa")
    public Double getSumma() {
        return summa;
    }

    public void setSumma(Double summa) {
        this.summa = summa;
    }

    @Basic
    @Column(name = "akt")
    public String getAkt() {
        return akt;
    }

    public void setAkt(String akt) {
        this.akt = akt;
    }

    @Basic
    @Column(name = "sale_id")
    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    @Basic
    @Column(name = "repair_info")
    public String getRepairInfo() {
        return repairInfo;
    }

    public void setRepairInfo(String repairInfo) {
        this.repairInfo = repairInfo;
    }

    @Basic
    @Column(name = "updateUserID")
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    @Basic
    @Column(name = "updateDate")
    public Timestamp getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Timestamp updateDate) {
        this.updateDate = updateDate;
    }

    @Basic
    @Column(name = "garantia")
    public Boolean getGarantia() {
        return garantia;
    }

    public void setGarantia(Boolean garantia) {
        this.garantia = garantia;
    }

    @Basic
    @Column(name = "workNotCall")
    public Boolean getWorkNotCall() {
        return workNotCall;
    }

    public void setWorkNotCall(Boolean workNotCall) {
        this.workNotCall = workNotCall;
    }

    @Basic
    @Column(name = "repare_in_info")
    public String getRepareInInfo() {
        return repareInInfo;
    }

    public void setRepareInInfo(String repareInInfo) {
        this.repareInInfo = repareInInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CashHistory that = (CashHistory) o;
        return sysId == that.sysId &&
                Objects.equals(goodSysId, that.goodSysId) &&
                Objects.equals(ownerSysId, that.ownerSysId) &&
                Objects.equals(markaCtoIn, that.markaCtoIn) &&
                Objects.equals(markaCtoOut, that.markaCtoOut) &&
                Objects.equals(markaPzuIn, that.markaPzuIn) &&
                Objects.equals(markaPzuOut, that.markaPzuOut) &&
                Objects.equals(markaMfpIn, that.markaMfpIn) &&
                Objects.equals(markaMfpOut, that.markaMfpOut) &&
                Objects.equals(markaReestrIn, that.markaReestrIn) &&
                Objects.equals(markaReestrOut, that.markaReestrOut) &&
                Objects.equals(markaCto2In, that.markaCto2In) &&
                Objects.equals(markaCto2Out, that.markaCto2Out) &&
                Objects.equals(markaCpIn, that.markaCpIn) &&
                Objects.equals(markaCpOut, that.markaCpOut) &&
                Objects.equals(zreportIn, that.zreportIn) &&
                Objects.equals(zreportOut, that.zreportOut) &&
                Objects.equals(itogIn, that.itogIn) &&
                Objects.equals(itogOut, that.itogOut) &&
                Objects.equals(state, that.state) &&
                Objects.equals(info, that.info) &&
                Objects.equals(executor, that.executor) &&
                Objects.equals(changeStateDate, that.changeStateDate) &&
                Objects.equals(startDate, that.startDate) &&
                Objects.equals(period, that.period) &&
                Objects.equals(dismissalDate, that.dismissalDate) &&
                Objects.equals(supportDate, that.supportDate) &&
                Objects.equals(details, that.details) &&
                Objects.equals(repairdateIn, that.repairdateIn) &&
                Objects.equals(repairdateOut, that.repairdateOut) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(summa, that.summa) &&
                Objects.equals(akt, that.akt) &&
                Objects.equals(saleId, that.saleId) &&
                Objects.equals(repairInfo, that.repairInfo) &&
                Objects.equals(updateUserId, that.updateUserId) &&
                Objects.equals(updateDate, that.updateDate) &&
                Objects.equals(garantia, that.garantia) &&
                Objects.equals(workNotCall, that.workNotCall) &&
                Objects.equals(repareInInfo, that.repareInInfo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sysId, goodSysId, ownerSysId, markaCtoIn, markaCtoOut, markaPzuIn, markaPzuOut, markaMfpIn, markaMfpOut, markaReestrIn, markaReestrOut, markaCto2In, markaCto2Out, markaCpIn, markaCpOut, zreportIn, zreportOut, itogIn, itogOut, state, info, executor, changeStateDate, startDate, period, dismissalDate, supportDate, details, repairdateIn, repairdateOut, deleted, summa, akt, saleId, repairInfo, updateUserId, updateDate, garantia, workNotCall, repareInInfo);
    }
}
