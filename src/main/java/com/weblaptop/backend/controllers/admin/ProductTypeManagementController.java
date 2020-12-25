package com.weblaptop.backend.controllers.admin;

import com.weblaptop.backend.models.DTO.ProductTypeDTO;
import com.weblaptop.backend.services.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/admin/product-type")
public class ProductTypeManagementController {
    @Autowired
    private ProductTypeService productTypeService;

    @GetMapping("/")
    public ResponseEntity<Map<String, Object>> getAll() {
        return productTypeService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getById(@PathVariable(value = "id") long id) {
        return productTypeService.getById(id);
    }

}
