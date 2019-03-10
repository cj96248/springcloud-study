package com.chao.provider.service;

import com.chao.provider.repository.entity.CategoryDo;

import java.util.List;

public interface CategoryService {

    List<CategoryDo> findAll(List<Integer> list);
}
