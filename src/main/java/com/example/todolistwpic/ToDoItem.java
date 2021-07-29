package com.example.todolistwpic;

public class ToDoItem {

    private long id = 0;


    private String name;


    private String description;


    private int priority;


    private String dueDate;


    private String picSrc;


    private boolean complete;

    //getters and setters
    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }


    public String getPicSrc() {
        return picSrc;
    }

    public void setPicSrc(String picSrc) {
        this.picSrc = picSrc;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }


}
