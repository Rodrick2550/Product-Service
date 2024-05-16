package com.example.productsservice.infrastructure.repositories;

import com.example.productsservice.infrastructure.IProductRepository;
import com.example.productsservice.infrastructure.ProductEntity;
import com.example.productsservice.infrastructure.outputport.IEntityRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MysqlRepository implements IEntityRepository {

    private final IProductRepository productRepository;


    public MysqlRepository(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public <T> T createProduct(T reg) {
        ProductEntity product = productRepository.save((ProductEntity) reg);
        return (T) product;

    }

    @Override
    public <T> List<T> getAllProducts(Class<T> clazz) {
        List<ProductEntity> products = productRepository.findAll();

        return (List<T>) products;
    }

    @Override
    public <T> Boolean deleteProductById(T reg) {
        productRepository.deleteById((String) reg);

        return Boolean.TRUE;
    }

}
