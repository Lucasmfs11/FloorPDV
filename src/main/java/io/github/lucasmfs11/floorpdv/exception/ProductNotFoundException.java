package io.github.lucasmfs11.floorpdv.exception;

public class ProductNotFoundException extends RuntimeException {

    public ProductNotFoundException(Long id) {
        super("Produto com ID: " + id + " nõo encontrado");
    }
}
