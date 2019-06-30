package com.microservices.social.fuse.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.Objects;

public class Device extends BaseModel {

    private Long id;

    private String name;

    private List<Activity> activities;

    public Device() { }

    public Device(@NotNull @Size(min = 5, max = 255, message = "Device name must have between 5 and 255 characters") String name) {
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
        Device device = (Device) o;
        return getId().equals(device.getId()) &&
                getName().equals(device.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
}
