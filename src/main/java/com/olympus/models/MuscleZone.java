package com.olympus.models;

public class MuscleZone {
    private long id;
    private String name;

    public MuscleZone() {
    }

    public MuscleZone(String name) {
        super();
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MuscleZone [id=" + id + ", name=" + name
                + "]";
    }
}
