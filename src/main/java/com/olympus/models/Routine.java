package com.olympus.models;

public class Routine {
    private long id;
    private String name;
    private long fk_user_id;
    private long fk_exercise_id;

    public Routine() {
    }

    public Routine(String name, long fk_user_id, long fk_exercise_id) {
        super();
        this.name = name;
        this.fk_user_id = fk_user_id;
        this.fk_exercise_id = fk_exercise_id;
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

    public long getFk_user_id() {
        return fk_user_id;
    }

    public void setFk_user_id(long fk_user_id) {
        this.fk_user_id = fk_user_id;
    }

    public long getFk_exercise_id() {
        return fk_exercise_id;
    }

    public void setFk_exercise_i(long fk_exercise_id) {
        this.fk_exercise_id = fk_exercise_id;
    }

    @Override
    public String toString() {
        return "Routine [id=" + id + ", name=" + name + ", fk_user_id=" + fk_user_id + ", fk_exercise_id="
                + fk_exercise_id
                + "]";
    }

}
