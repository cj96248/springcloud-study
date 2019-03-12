package com.chao.provider.service.impl;

import com.chao.provider.repository.ProductRepository;
import com.chao.provider.repository.entity.ProductDo;
import com.chao.provider.service.ProductService;
import com.chao.provider.support.ProductStatusEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ProductDo> findUpAll() {
        return productRepository.findAllByProductStatus(ProductStatusEnum.UP.getStatus());
    }
}
