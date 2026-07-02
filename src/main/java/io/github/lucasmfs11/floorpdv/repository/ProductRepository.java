package io.github.lucasmfs11.floorpdv.repository;

import io.github.lucasmfs11.floorpdv.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,Long>
{
}