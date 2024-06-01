package org.example.orm.controller;

import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Manager;
import org.example.orm.service.ManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manager")
public class ManagerController {
    private final ManagerService managerService;

    public ManagerController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping
    public ResponseEntity<List<ObjectResponseDto>> getList(){
        return new ResponseEntity<>(managerService.getList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObjectResponseDto> create(@RequestParam String name){
        return new ResponseEntity<>(managerService.create(name),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ObjectResponseDto> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(managerService.update(id,name),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<ObjectResponseDto> delete(@RequestParam int id){
        return new ResponseEntity<>(managerService.delete(id),HttpStatus.OK);
    }
}
