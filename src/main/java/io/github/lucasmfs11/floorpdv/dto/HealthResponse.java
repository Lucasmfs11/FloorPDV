package io.github.lucasmfs11.floorpdv.dto;

public record HealthResponse (
    String status,
    String application,
    String version
    ){

}

