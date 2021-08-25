package com.store.hardwarestore.repositories;

import com.store.hardwarestore.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
