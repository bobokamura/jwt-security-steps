package com.cotefacil.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("Teste");
    }
}
