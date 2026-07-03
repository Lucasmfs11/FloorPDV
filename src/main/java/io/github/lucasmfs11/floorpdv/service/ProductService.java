package io.github.lucasmfs11.floorpdv.service;

import io.github.lucasmfs11.floorpdv.dto.ProductCreateRequest;
import io.github.lucasmfs11.floorpdv.entity.Product;
import io.github.lucasmfs11.floorpdv.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product create(ProductCreateRequest request) {

        Product product = new Product();

        product.setName(request.name());
        product.setSku(request.sku());
        product.setEan(request.ean());
        product.setPrice(request.price());
        product.setCostPrice(request.costPrice());
        product.setStock(request.initialStock());

        product.setActive(true);
        product.setUpdatedAt(LocalDateTime.now());

        return productRepository.save(product);

    }

}