package com.olympus.models;

public class UsersAchievements {
    private long fk_user_id;
    private long fk_achievement_id;

    public UsersAchievements() {
    }

    public UsersAchievements(long fk_user_id, long fk_achievement_id) {
        super();
        this.fk_user_id = fk_user_id;
        this.fk_achievement_id = fk_achievement_id;
    }

    public long getFk_user_id() {
        return fk_user_id;
    }

    public void setFk_user_id(long fk_user_id) {
        this.fk_user_id = fk_user_id;
    }

    public long getFk_achievement_id() {
        return fk_achievement_id;
    }

    public void setFk_achievement_id(long fk_achievement_id) {
        this.fk_achievement_id = fk_achievement_id;
    }

    @Override
    public String toString() {
        return "User_achievement_relation [fk_user_id=" + fk_user_id + ", fk_achievement_id=" + fk_achievement_id
                + "]";
    }
}
