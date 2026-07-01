package io.github.lucasmfs11.floorpdv.controller;

import io.github.lucasmfs11.floorpdv.dto.HealthResponse;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class HealthController {

    private final BuildProperties buildProperties;

    public HealthController(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    @GetMapping("/health")
    public HealthResponse getHealth() {
        return new HealthResponse(
                "UP",
                "Floor PDV",
                buildProperties.getVersion()

        );
    }

}
