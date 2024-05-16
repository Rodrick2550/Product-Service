package com.example.productsservice.infrastructure.outputport;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEntityRepository {

    public <T> T createProduct(T entity);

    public <T>List<T> getAllProducts(Class<T> entity);

    public <T> Boolean deleteProductById(T reg);


}
