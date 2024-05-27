package org.example.orm.repository;

import org.example.orm.entity.Position;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PositionRepository extends JpaRepository<Position,Integer> {
}
