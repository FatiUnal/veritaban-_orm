package org.example.orm.controller;

import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Departmant;
import org.example.orm.entity.Manager;
import org.example.orm.service.DepartmantService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departmant")
public class DepartmantController {
    private final DepartmantService departmantService;

    public DepartmantController(DepartmantService departmantService) {
        this.departmantService = departmantService;
    }

    @GetMapping
    public ResponseEntity<List<ObjectResponseDto>> getList(){
        return new ResponseEntity<>(departmantService.getList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObjectResponseDto> create(@RequestParam String name){
        return new ResponseEntity<>(departmantService.create(name),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ObjectResponseDto> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(departmantService.update(id,name),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<ObjectResponseDto> delete(@RequestParam int id){
        return new ResponseEntity<>(departmantService.delete(id),HttpStatus.OK);
    }
}
