package com.company;

import com.sun.tools.javac.jvm.Items;

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
    protected List<Task> allTasks = new ArrayList<>();
    protected List<Task> incompleteTasks = new ArrayList<>();
    protected List<Task> completedTasks = new ArrayList<>();

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
        allTasks.add(task);
        incompleteTasks.add(task);

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
        for (Task task : allTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }

    }

    protected void viewIncompleteTasks() {

        System.out.println("\nINCOMPLETE TASKS");

        int position = 1;
        for (Task task : incompleteTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }


        menu.viewDetailsMenu();
    }


    protected void viewTaskDetails() {

        System.out.println("\nINCOMPLETE TASKS\nEnter the number corresponding to the task you would like to see in detail: ");


        int position = 1;
        for (Task task : incompleteTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }

        int i = input.nextInt() - 1;
        System.out.println(incompleteTasks.get(i).getTaskName());
        System.out.println(incompleteTasks.get(i).getTaskDescription());
        System.out.println(incompleteTasks.get(i).getTaskDeadline());

        menu.viewDetailsMenu();
    }

    protected void makeTaskComplete() {

        System.out.println("\nEnter the number corresponding to the task you have completed: ");

        int position = 1;
        for (Task task : incompleteTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }

        int i = input.nextInt() - 1;
        Calendar calendar = Calendar.getInstance();

        System.out.println("You have completed " + incompleteTasks.get(i).getTaskName() + " on " + dateFormat.format(calendar.getTime()));
        System.out.println();

        incompleteTasks.remove(task);
        completedTasks.add(task);

        menu.taskListMenu();
    }

    protected void viewCompletedTasks() {

        System.out.println("\nCOMPLETED TASKS");

        int position = 1;
        for (Task task : completedTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }
    }

    protected void editTask() {

        System.out.println("\nINCOMPLETE TASKS");

        int position = 1;
        for (Task task : incompleteTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }

        int i = input.nextInt() - 1;
        System.out.println(incompleteTasks.get(i).getTaskName());
        System.out.println(incompleteTasks.get(i).getTaskDescription());
        System.out.println(incompleteTasks.get(i).getTaskDeadline());

        System.out.println("Would you like to edit this task's name, currently '" + task.getTaskName() + "'? Enter y/n: ");
        if (input.nextLine().toUpperCase().equals("y")) {
            System.out.println("Enter the new name of this task: ");
            String taskName = input.nextLine();
            task.setTaskName(taskName);
        }
        if (input.nextLine().toUpperCase().equals("n")) {
            task.getTaskName();
        }

        System.out.println("Would you like to edit this task's description, currently '" + task.getTaskDescription() + "'? Enter y/n: ");
        if (input.nextLine().toUpperCase().equals("y")) {
            System.out.println("Enter the new description for this task: ");
            String taskDescription = input.nextLine();
            task.setTaskDescription(taskDescription);
        }
        if (input.nextLine().toUpperCase().equals("n")) {
            task.getTaskDescription();
        }

        System.out.println("Would you like to edit this task's deadline, currently " + task.getTaskDeadline() + "? Enter y/n: ");
        if (input.nextLine().toUpperCase().equals("y")) {
            System.out.println("Enter the new deadline for this task: ");
            String taskDeadline = input.nextLine();
            task.setTaskDeadline(taskDeadline);
        }
        if (input.nextLine().toUpperCase().equals("n")) {
            task.getTaskDeadline();
        }
        System.out.println("\nHere is your edited task:\n");
        System.out.println("Task Name: " + task.getTaskName() + "\nDescription: " + task.getTaskDescription() + "\nComplete by: " + task.getTaskDeadline());

        menu.editTasksMenu();
    }

    protected void deleteTask() {

        System.out.println("Enter the number that corresponds to the task you would like to delete from your task list: ");

        System.out.println("\nALL TASKS");

        int position = 1;
        for (Task task : allTasks) {
            System.out.println(position + ". " + task.getTaskName());
            position++;
        }

        int i = input.nextInt() - 1;
        System.out.println(allTasks.get(i).getTaskName() + " has been removed from your task list.");

        allTasks.remove(task);

        menu.editTasksMenu();
    }
}
