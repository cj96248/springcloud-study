package com.chao.provider.support;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String msg;
    private T data;

    public static CommonResult fail(){
        return new CommonResult(500, "失败", null);
    }

    public static<T> CommonResult build(T t){
        return new CommonResult(200, "成功", t);
    }

    public static<T> CommonResult build(Integer code, String msg,T t){
        return new CommonResult(code, msg, t);
    }
}
