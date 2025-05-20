package com.ronaldbenitez.rest.api.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private boolean active;

    @ElementCollection
    private List<String> skills;

    // Constructors
    public User() {
    }

    public User(String name, int age, List<String> skills, boolean active) {
        this.name = name;
        this.age = age;
        this.skills = skills;
        this.active = active;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
