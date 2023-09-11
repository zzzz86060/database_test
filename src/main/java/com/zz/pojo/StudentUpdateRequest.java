package com.zz.pojo;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class StudentUpdateRequest {
    private BigDecimal SNO;
    private BigDecimal TC;

    // 省略构造函数和 getter/setter 方法
}
