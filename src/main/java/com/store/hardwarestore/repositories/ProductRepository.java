package com.store.hardwarestore.repositories;

import com.store.hardwarestore.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
