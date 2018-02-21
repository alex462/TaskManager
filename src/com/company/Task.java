package com.company;

/*
TASK: This class will define "task" and hold getters and setters for anything related to the definition of a "task"
 */
public class Task {

    private String task;
    private String dueDate;
    private boolean isComplete;

    public Task() {
    }

    public Task(String task, String dueDate, boolean isCompleted) {
        this.task = task;
        this.dueDate = dueDate;
        this.isComplete = isCompleted;
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

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean completed) {
        isComplete = completed;
    }
}
