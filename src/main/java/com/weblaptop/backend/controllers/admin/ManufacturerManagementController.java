package com.weblaptop.backend.controllers.admin;

import com.weblaptop.backend.models.DTO.ManufacturerDTO;
import com.weblaptop.backend.services.ManufacturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin/manufacturer")
public class ManufacturerManagementController {
    @Autowired
    private ManufacturerService service;
    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> getAll() {
        return  service.getAll();
    }
    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable(value = "id") long id) {
        return service.getById(id);
    }
}
