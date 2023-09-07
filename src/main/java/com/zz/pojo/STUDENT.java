package com.zz.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class STUDENT {
    BigDecimal SNO;
    String sname;
    String ssex;
    String sbirthday;
    String speciality;
    String SCLASS;
    BigDecimal TC;
}
