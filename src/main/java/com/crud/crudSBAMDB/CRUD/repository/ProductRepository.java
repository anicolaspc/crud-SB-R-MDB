package com.crud.crudSBAMDB.CRUD.repository;

import com.crud.crudSBAMDB.CRUD.entity.Product;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
    boolean existsByNombre(String nombre);
    Optional<Product> findByNombre(String nombre);
}
