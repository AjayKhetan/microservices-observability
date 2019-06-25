package com.microservices.medical.fuse.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class Sport extends BaseModel {

    private Long id;

    private String name;

    private SportType type;

    private List<Activity> activities;

    public Sport() { }

    public Sport(@NotNull @Size(min = 5, max = 255, message = "Sport name 5 and 255 characters") String name, SportType type) {
        this.name = name;
        this.type = type;
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

    public SportType getType() {
        return type;
    }

    public void setType(SportType type) {
        this.type = type;
    }

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sport sport = (Sport) o;
        return getId().equals(sport.getId()) &&
                getName().equals(sport.getName()) &&
                getType().equals(sport.getType());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getType());
    }
}
