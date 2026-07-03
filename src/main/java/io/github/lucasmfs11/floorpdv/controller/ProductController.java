package io.github.lucasmfs11.floorpdv.controller;


import io.github.lucasmfs11.floorpdv.dto.ProductCreateRequest;
import io.github.lucasmfs11.floorpdv.entity.Product;
import io.github.lucasmfs11.floorpdv.service.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @PostMapping
    public Product create(@RequestBody ProductCreateRequest request) {
        return productService.create(request);

    }
}
