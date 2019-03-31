package com.chao.provider.repository;

import com.chao.provider.repository.entity.CategoryDo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepository extends JpaRepository<CategoryDo, String> {

    List<CategoryDo> findByCategoryTypeIn(List<Integer> list);
}
