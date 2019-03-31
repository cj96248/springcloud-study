package com.chao.provider.support;

import lombok.Getter;
import lombok.Setter;

@Getter
public enum  ProductStatusEnum {
    UP(0, "上架"),
    DOWN(1, "下架");
    private int status;
    private String message;

    ProductStatusEnum(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
