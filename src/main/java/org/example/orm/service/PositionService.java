package org.example.orm.service;

import org.example.orm.builder.ObjectBuilder;
import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Position;
import org.example.orm.repository.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PositionService {
    private final PositionRepository positionRepository;
    private final ObjectBuilder builder;

    public PositionService(PositionRepository positionRepository, ObjectBuilder builder) {
        this.positionRepository = positionRepository;
        this.builder = builder;
    }

    public List<ObjectResponseDto> getList() {
        return positionRepository.findAll().stream().map(builder::getDto).collect(Collectors.toList());
    }

    public ObjectResponseDto create(String name) {
        Position position = new Position(name);
        return builder.getDto(positionRepository.save(position));
    }

    public ObjectResponseDto update(int id, String name) {
        Position position = positionRepository.findById(id).orElseThrow(()-> new RuntimeException());
        position.setName(name);
        return builder.getDto(positionRepository.save(position));
    }

    public ObjectResponseDto delete(int id) {
        Position position = positionRepository.findById(id).orElseThrow(()-> new RuntimeException());
        positionRepository.delete(position);
        return builder.getDto(position);
    }

    public Position findById(int positionId) {
        return positionRepository.findById(positionId).orElseThrow(()-> new RuntimeException());
    }
}
