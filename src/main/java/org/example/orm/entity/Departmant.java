package org.example.orm.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Departmant {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(mappedBy = "departmant",cascade = CascadeType.ALL)
    private List<Human> humans = new ArrayList<>();

    public Departmant(int id, String name, List<Human> humans) {
        this.id = id;
        this.name = name;
        this.humans = humans;
    }

    public Departmant(String name) {
        this.name = name;
    }

    public Departmant() {

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
