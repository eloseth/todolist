package com.list.todolist.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {

    @Id //primærnøkkel
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generer ny id automatisk

    private Long id;
    private String description;
    private boolean done;

    public Task() {} //tom konstruktør kreves av jpa

    public Task(String description, boolean done){
        this.description = description;
        this.done = done;
    }
     public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
    
}
