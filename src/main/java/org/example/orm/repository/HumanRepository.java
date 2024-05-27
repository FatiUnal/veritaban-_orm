package org.example.orm.repository;

import org.example.orm.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanRepository extends JpaRepository<Human,Integer> {
}
