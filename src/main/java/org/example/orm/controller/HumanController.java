package org.example.orm.controller;

import org.example.orm.dto.HumanCreateDto;
import org.example.orm.dto.HumanResponseDto;
import org.example.orm.entity.Human;
import org.example.orm.entity.Manager;
import org.example.orm.service.HumanService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/human")
public class HumanController {
    private final HumanService humanService;

    public HumanController(HumanService humanService) {
        this.humanService = humanService;
    }

    @GetMapping
    public ResponseEntity<List<HumanResponseDto>> getList(){
        return new ResponseEntity<>(humanService.getList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<HumanResponseDto> create(@RequestBody HumanCreateDto human){
        return new ResponseEntity<>(humanService.create(human),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Human> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(humanService.update(id,name),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam int id){
        return new ResponseEntity<>(humanService.delete(id),HttpStatus.OK);
    }
}
