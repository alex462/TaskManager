package com.company;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/*
TaskList: This class will hold all methods for both the Main Menu and the Edit Menu.
 */


public class TaskList {

    public Menu menu;
    Task task = new Task();
    private Scanner input = new Scanner(System.in);


    protected TaskList(Menu menu) {
        this.menu = menu;
    }

    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy");
    protected List<String> allTasks = new ArrayList<>();
    protected List<String> incompleteTasks = new ArrayList<>();
    protected List<String> completedTasks = new ArrayList<>();

    protected void createTask() {

        System.out.println("\nCREATE A TASK");

        System.out.println("Task name: ");
        String taskName = input.nextLine();
        task.setTaskName(taskName);

        System.out.println("Task description:");
        String taskDescription = input.nextLine();
        task.setTaskDescription(taskDescription);

        System.out.println("Task deadline:");
        String taskDeadline = input.nextLine();
        task.setTaskDeadline(taskDeadline);

        //create task object and add to both arraylists allTasks and incompleteTasks
        Task task = new Task(taskName, taskDescription, taskDeadline);
        allTasks.add(taskName);
        incompleteTasks.add(task.getTaskName());

        //output new task to user
        System.out.println("\nHere is the task you have created:\n");
        System.out.println("Task Name: " + task.getTaskName() + "\nDescription: " + task.getTaskDescription() + "\nComplete by: " + task.getTaskDeadline());

        System.out.println("\nYou may edit, delete, or mark this task as complete from the TASK EDITING MENU.\nYou may view this task's details by selecting the 'View your tasks' option from the MAIN MENU.");

        //return to main menu
        menu.mainMenu();
    }

    protected void viewAllTasks() {

        System.out.println("\nALL TASKS");

        int position = 1;
        for (int i = 0; i < allTasks.size(); i++) {
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }
    }

    protected void viewIncompleteTasks() {

        System.out.println("\nINCOMPLETE TASKS");

        int position = 1;
        for(int i = 0; i < allTasks.size(); i++){
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }

        menu.viewDetailsMenu();
    }



    protected void viewTaskDetails(){

        System.out.println("\nINCOMPLETE TASKS\nEnter the number corresponding to the task you would like to see in detail: ");

        Task task = new Task();
        int position = 1;
        for (int i = 0; i < allTasks.size(); i++) {
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }

        String taskName = allTasks.get((input.nextInt() - 1));
        if (taskName.equals(task.getTaskName())) {
            System.out.println(task.getTaskName());
            System.out.println(task.getTaskDescription());
            System.out.println((task.getTaskDeadline()));
        }

        menu.viewDetailsMenu();
    }

    protected void makeTaskComplete() {

        System.out.println("\nEnter the number corresponding to the task you have completed: ");

        int position = 1;
        for (int i = 0; i < incompleteTasks.size(); i++) {
            System.out.println(position + ". " + incompleteTasks.get(i) + " ");
            position++;
        }

        String tempTask = incompleteTasks.get(input.nextInt() - 1);
        Calendar calendar = Calendar.getInstance();

        System.out.println("You have completed " + tempTask + " on " + dateFormat.format(calendar.getTime()));
        System.out.println();

        incompleteTasks.remove(tempTask);
        completedTasks.add(tempTask);

        menu.taskListMenu();
    }

    protected void viewCompletedTasks() {

        System.out.println("\nCOMPLETED TASKS");

        int position = 1;
        for (int i = 0; i < completedTasks.size(); i++) {
            System.out.println(position + ". " + completedTasks.get(i) + " ");
            position++;
        }
    }

    protected void editTask() {

        System.out.println("\nINCOMPLETE TASKS");

        int position = 1;
        for(int i = 0; i < allTasks.size(); i++){
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }

        String taskName = allTasks.get((input.nextInt() - 1));
        if (taskName.equals(task.getTaskName())) {
            System.out.println(task.getTaskName());
            System.out.println(task.getTaskDescription());
            System.out.println((task.getTaskDeadline()));
        }

        System.out.println("Would you like to edit this task's name, currently '" + task.getTaskName() + "'? Enter y/n: ");
        if(input.nextLine().toUpperCase().equals("y")){
            System.out.println("Enter the new name of this task: ");
            task.setTaskName(input.nextLine());
        }
        if(input.nextLine().toUpperCase().equals("n")){
            task.setTaskName(task.getTaskName());
        }else{
            invalidEntry();
        }

        System.out.println("Would you like to edit this task's description, currently '" + task.getTaskDescription() + "'? Enter y/n: ");
        if(input.nextLine().toUpperCase().equals("y")){
            System.out.println("Enter the new description for this task: ");
            task.setTaskDescription(input.nextLine());
        }
        if(input.nextLine().toUpperCase().equals("n")){
            task.setTaskDescription(task.getTaskDescription());
        }else{
            invalidEntry();
        }

        System.out.println("Would you like to edit this task's deadline, currently " + task.getTaskDeadline() + "? Enter y/n: ");
        if(input.nextLine().toUpperCase().equals("y")){
            System.out.println("Enter the new deadline for this task: ");
            task.setTaskDeadline(input.next());
        }if(input.nextLine().toUpperCase().equals("n")){
            task.setTaskDeadline(task.getTaskDeadline());
        }else{
            invalidEntry();
        }

        System.out.println("\nHere is your edited task:\n");
        System.out.println("Task Name: " + task.getTaskName() + "\nDescription: " + task.getTaskDescription() + "\nComplete by: " + task.getTaskDeadline());

        menu.editTasksMenu();
    }

    protected void deleteTask() {

        System.out.println("Enter the number that corresponds to the task you would like to delete from your task list: ");

        System.out.println("\nALL TASKS");

        int position = 1;
        for (int i = 0; i < allTasks.size(); i++) {
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }

        String tempTask = allTasks.get(input.nextInt() - 1);
        System.out.println(tempTask + " has been removed from your task list.");

        allTasks.remove(tempTask);

        menu.editTasksMenu();
    }

    private void exitProgram() {

        System.out.println("\nThank you for using the Task Manager.");
        System.exit(13);
    }

    //error handling
    private void invalidEntry() {

        System.out.println("Invalid entry.");
    }
}
