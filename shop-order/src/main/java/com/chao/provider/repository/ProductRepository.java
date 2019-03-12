package com.chao.provider.repository;

import com.chao.provider.repository.entity.ProductDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductDo, Integer> {

    List<ProductDo> findAllByProductStatus(Integer status);
}
