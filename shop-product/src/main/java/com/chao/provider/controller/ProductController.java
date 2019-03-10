package com.chao.provider.controller;

import com.chao.provider.controller.entity.ProductInfoVo;
import com.chao.provider.controller.entity.ProductVo;
import com.chao.provider.repository.entity.CategoryDo;
import com.chao.provider.repository.entity.ProductDo;
import com.chao.provider.service.CategoryService;
import com.chao.provider.service.ProductService;
import com.chao.provider.support.CommonResult;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public CommonResult<ProductVo> list(){
        List<ProductDo> products = productService.findUpAll();
        List<Integer> types = products.stream().map(ProductDo::getCategoryType).collect(Collectors.toList());
        List<CategoryDo> categories = categoryService.findAll(types);

        List<ProductVo> result = new ArrayList<>();
        for(CategoryDo category : categories){
            ProductVo product = new ProductVo();
            product.setCategoryName(category.getCategoryName());
            product.setCategoryType(category.getCategoryType());

            List<ProductInfoVo> productInfoVoList = new ArrayList<>();
            for(ProductDo p : products){
                if(p.getCategoryType() == category.getCategoryType()){
                    ProductInfoVo productInfoVo = new ProductInfoVo();
                    BeanUtils.copyProperties(p, productInfoVo);
                    productInfoVoList.add(productInfoVo);
                    product.setFoods(productInfoVoList);
                }
            }
            result.add(product);
        }
        return CommonResult.build(result);


    }
}
