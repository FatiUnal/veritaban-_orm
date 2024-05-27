package org.example.orm.controller;

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
    public ResponseEntity<List<Manager>> getList(){
        return new ResponseEntity<>(managerService.getList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Manager> create(@RequestParam String name){
        return new ResponseEntity<>(managerService.create(name),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Manager> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(managerService.update(id,name),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<Manager> delete(@RequestParam int id){
        return new ResponseEntity<>(managerService.delete(id),HttpStatus.OK);
    }
}
