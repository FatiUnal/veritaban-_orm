package org.example.orm.controller;

import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Position;
import org.example.orm.service.PositionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/position")
public class PositionController {
    private final PositionService positionService;

    public PositionController(PositionService positionService) {
        this.positionService = positionService;
    }


    @GetMapping
    public ResponseEntity<List<ObjectResponseDto>> getList(){
        return new ResponseEntity<>(positionService.getList(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<ObjectResponseDto> create(@RequestParam String name){
        return new ResponseEntity<>(positionService.create(name),HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ObjectResponseDto> update(@RequestParam int id, @RequestParam String name){
        return new ResponseEntity<>(positionService.update(id,name),HttpStatus.CREATED);
    }

    @DeleteMapping
    public ResponseEntity<ObjectResponseDto> delete(@RequestParam int id){
        return new ResponseEntity<>(positionService.delete(id),HttpStatus.OK);
    }
}
