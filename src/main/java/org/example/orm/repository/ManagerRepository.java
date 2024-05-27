package org.example.orm.repository;

import org.example.orm.entity.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager,Integer> {
}
