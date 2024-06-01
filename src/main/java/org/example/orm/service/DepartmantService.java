package org.example.orm.service;

import org.example.orm.builder.ObjectBuilder;
import org.example.orm.dto.ObjectResponseDto;
import org.example.orm.entity.Departmant;
import org.example.orm.repository.DepartmantRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmantService {
    private final DepartmantRepository departmantRepository;
    private final ObjectBuilder builder;

    public DepartmantService(DepartmantRepository departmantRepository, ObjectBuilder builder) {
        this.departmantRepository = departmantRepository;
        this.builder = builder;
    }

    public List<ObjectResponseDto> getList() {
        return departmantRepository.findAll().stream().map(builder::getDto).collect(Collectors.toList());
    }

    public ObjectResponseDto create(String name) {
        Departmant departmant = new Departmant(name);
        return builder.getDto(departmantRepository.save(departmant));
    }

    public ObjectResponseDto update(int id, String name) {
        Departmant departmant = departmantRepository.findById(id).orElseThrow(()-> new RuntimeException());
        departmant.setName(name);
        return builder.getDto(departmantRepository.save(departmant));
    }

    public ObjectResponseDto delete(int id) {
        Departmant departmant = departmantRepository.findById(id).orElseThrow(()-> new RuntimeException());
        departmantRepository.delete(departmant);
        return builder.getDto(departmant);
    }

    public Departmant findById(int departmantId) {
        return departmantRepository.findById(departmantId).orElseThrow(()-> new RuntimeException());
    }
}
