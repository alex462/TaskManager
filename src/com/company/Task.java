package com.company;

/*
TASK: This class will define "task" and hold getters and setters for anything related to the definition of a "task"
 */
public class Task {

    private String task;
    private String dueDate;
    private boolean isCompleted;

    public Task() {
    }

    public Task(String task, String dueDate, boolean isCompleted) {
        this.task = task;
        this.dueDate = dueDate;
        this.isCompleted = isCompleted;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
