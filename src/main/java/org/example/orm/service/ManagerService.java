package org.example.orm.service;

import org.example.orm.entity.Manager;
import org.example.orm.repository.ManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    private final ManagerRepository managerRepository;

    public ManagerService(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    public List<Manager> getList() {
        return managerRepository.findAll();
    }

    public Manager create(String name) {
        Manager manager = new Manager(name);
        return managerRepository.save(manager);
    }

    public Manager update(int id, String name) {
        Manager manager = managerRepository.findById(id).orElseThrow(()->new RuntimeException());
        manager.setName(name);
        return managerRepository.save(manager);
    }

    public Manager delete(int id) {
        Manager manager = managerRepository.findById(id).orElseThrow(()->new RuntimeException());
        managerRepository.delete(manager);
        return manager;
    }

    public Manager findById(int managerId) {
        return managerRepository.findById(managerId).orElseThrow(()->new RuntimeException());
    }
}
