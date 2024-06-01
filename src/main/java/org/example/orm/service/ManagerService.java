package org.example.orm.service;

import org.example.orm.builder.ObjectBuilder;
import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Manager;
import org.example.orm.repository.ManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ManagerService {
    private final ManagerRepository managerRepository;
    private final ObjectBuilder builder;

    public ManagerService(ManagerRepository managerRepository, ObjectBuilder builder) {
        this.managerRepository = managerRepository;
        this.builder = builder;
    }

    public List<ObjectResponseDto> getList() {
        return managerRepository.findAll().stream().map(builder::getDto).collect(Collectors.toList());
    }

    public ObjectResponseDto create(String name) {
        Manager manager = new Manager(name);
        return builder.getDto(managerRepository.save(manager));
    }

    public ObjectResponseDto update(int id, String name) {
        Manager manager = managerRepository.findById(id).orElseThrow(()->new RuntimeException());
        manager.setName(name);
        return builder.getDto(managerRepository.save(manager));
    }

    public ObjectResponseDto delete(int id) {
        Manager manager = managerRepository.findById(id).orElseThrow(()->new RuntimeException());
        managerRepository.delete(manager);
        return builder.getDto(manager);
    }

    public Manager findById(int managerId) {
        return managerRepository.findById(managerId).orElseThrow(()->new RuntimeException());
    }
}
