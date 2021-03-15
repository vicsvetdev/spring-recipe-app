package com.vicsvetdev.springrecipeapp.repositories;

import com.vicsvetdev.springrecipeapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
