package io.github.lucasmfs11.floorpdv.dto;

import java.math.BigDecimal;

public record ProductCreateRequest (
        String name,
        String sku,
        String ean,
        BigDecimal price,
        BigDecimal costPrice,
        BigDecimal initialStock
){
}