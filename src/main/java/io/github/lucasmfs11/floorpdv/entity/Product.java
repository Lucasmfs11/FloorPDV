package io.github.lucasmfs11.floorpdv.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String externalErpId;

    private String name;
    private String sku;
    private String ean;

    private BigDecimal price;
    private BigDecimal costPrice;
    private BigDecimal stock;

    private Boolean active;

    private LocalDateTime updatedAt;
}
