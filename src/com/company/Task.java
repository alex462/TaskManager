package com.company;

//import static com.company.Main.menu;

/*
TASK: This class will define "task" and hold getters and setters for anything related to the definition of a "task"
 */
public class Task {

    private String entireTask;
    private String taskName;
    private String taskDescription;
    private String deadline;
    private boolean isPriority;
    private String otherNotes;
    private boolean isComplete;

    public Task() {
    }

    public void setEntireTask(String taskName, String taskDescription, String deadline, boolean isPriority, String otherNotes, boolean isComplete) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.deadline = deadline;
        this.isPriority = isPriority;
        this.otherNotes = otherNotes;
        this.isComplete = isComplete;
    }

    public String getEntireTask(){
        return entireTask;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public boolean isPriority() {
        return isPriority;
    }

    public void setPriority(boolean priority) {
        isPriority = priority;
    }

    public String getOtherNotes() {
        return otherNotes;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
