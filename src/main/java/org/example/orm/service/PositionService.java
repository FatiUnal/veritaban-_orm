package org.example.orm.service;

import org.example.orm.entity.Position;
import org.example.orm.repository.PositionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionService {
    private final PositionRepository positionRepository;

    public PositionService(PositionRepository positionRepository) {
        this.positionRepository = positionRepository;
    }

    public List<Position> getList() {
        return positionRepository.findAll();
    }

    public Position create(String name) {
        Position position = new Position(name);
        return positionRepository.save(position);
    }

    public Position update(int id, String name) {
        Position position = positionRepository.findById(id).orElseThrow(()-> new RuntimeException());
        position.setName(name);
        return positionRepository.save(position);
    }

    public Position delete(int id) {
        Position position = positionRepository.findById(id).orElseThrow(()-> new RuntimeException());
        positionRepository.delete(position);
        return position;
    }

    public Position findById(int positionId) {
        return positionRepository.findById(positionId).orElseThrow(()-> new RuntimeException());
    }
}
