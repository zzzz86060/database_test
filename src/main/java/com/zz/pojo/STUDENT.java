package com.zz.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;


public class STUDENT {
    BigDecimal SNO;
    String sname;
    String ssex;
    String sbirthday;
    String speciality;
    String SCLASS;
    BigDecimal TC;

    public BigDecimal getSNO() {
        return SNO;
    }

    public void setSNO(BigDecimal SNO) {
        this.SNO = SNO;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getSCLASS() {
        return SCLASS;
    }

    public void setSCLASS(String SCLASS) {
        this.SCLASS = SCLASS;
    }

    public BigDecimal getTC() {
        return TC;
    }

    public void setTC(BigDecimal TC) {
        this.TC = TC;
    }
}
