package org.example.orm.repository;

import org.example.orm.entity.Departmant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmantRepository extends JpaRepository<Departmant,Integer> {
}
