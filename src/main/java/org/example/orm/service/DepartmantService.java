package org.example.orm.service;

import org.example.orm.entity.Departmant;
import org.example.orm.repository.DepartmantRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmantService {
    private final DepartmantRepository departmantRepository;

    public DepartmantService(DepartmantRepository departmantRepository) {
        this.departmantRepository = departmantRepository;
    }

    public List<Departmant> getList() {
        return departmantRepository.findAll();
    }

    public Departmant create(String name) {
        Departmant departmant = new Departmant(name);
        return departmantRepository.save(departmant);
    }

    public Departmant update(int id, String name) {
        Departmant departmant = departmantRepository.findById(id).orElseThrow(()-> new RuntimeException());
        departmant.setName(name);
        return departmantRepository.save(departmant);
    }

    public Departmant delete(int id) {
        Departmant departmant = departmantRepository.findById(id).orElseThrow(()-> new RuntimeException());
        departmantRepository.delete(departmant);
        return departmant;
    }

    public Departmant findById(int departmantId) {
        return departmantRepository.findById(departmantId).orElseThrow(()-> new RuntimeException());
    }
}
