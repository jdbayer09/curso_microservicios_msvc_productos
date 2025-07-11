package com.jdbayer.msvc.products.repositories;

import com.jdbayer.msvc.products.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends CrudRepository<Product, UUID> {

}
