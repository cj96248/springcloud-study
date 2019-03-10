package com.chao.provider.service.impl;

import com.chao.provider.repository.CategoryRepository;
import com.chao.provider.repository.entity.CategoryDo;
import com.chao.provider.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public List<CategoryDo> findAll(List<Integer> list) {
        return categoryRepository.findByCategoryTypeIn(list);
    }
}
