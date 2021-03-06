package com.weblaptop.backend.controllers;

import com.weblaptop.backend.models.DTO.KeyboardDTO;
import com.weblaptop.backend.models.DTO.RamDTO;
import com.weblaptop.backend.services.KeyboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@CrossOrigin(origins = "https://laptopre.herokuapp.com")
@RequestMapping("/api/keyboard")
public class KeyboardController {
    @Autowired
    private KeyboardService KeyboardService;

    @GetMapping("/")

    public ResponseEntity<Map<String, Object>> getAll() {
        return KeyboardService.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable(value = "id") long id) {
        return KeyboardService.getById(id);
    }
}
