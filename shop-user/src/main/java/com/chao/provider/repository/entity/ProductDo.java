package com.chao.provider.repository.entity;

import lombok.Data;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "product_info")
@Entity
@Data
public class ProductDo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private String productStock;
    private String productDesc;
    private String productIcon;
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;

}
