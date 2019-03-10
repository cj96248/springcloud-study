package com.chao.provider.service;

import com.chao.provider.repository.entity.ProductDo;

import java.util.List;


public interface ProductService {

    List<ProductDo> findUpAll();
}
