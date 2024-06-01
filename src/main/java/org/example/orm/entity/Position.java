package org.example.orm.entity;

import jakarta.persistence.*;
import org.example.orm.entity.Human;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Position {

    @Id
    @GeneratedValue
    private int id;

    private String name;

    @OneToMany(mappedBy = "position",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Human> humans = new ArrayList<>();

    public Position(int id, String name, List<Human> humans) {
        this.id = id;
        this.name = name;
        this.humans = humans;
    }

    public Position(String name) {
        this.name = name;
    }

    public Position() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }
}
