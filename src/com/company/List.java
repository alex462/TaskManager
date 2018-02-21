package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
LIST: This class will hold all methods for both the Main Menu and the Edit Menu.
 */

public class List {

    public final Menu menu;

    public List(Menu menu) {
        this.menu = menu;
    }

    Task task = new Task();

    private Scanner input = new Scanner(System.in);

//    protected List<String> allTasks = new ArrayList<>();
//    protected List<String> completedTasks = new ArrayList<>();
//    protected List<String> uncompletedTasks = new ArrayList<>();


    protected void createTask() {

        /**
         * Questions to ask:
         * task name
         * task description
         * deadline
         * priority (y/n)
         * other notes
         */

    }

    protected void viewAllTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */

    }

    protected void viewIncompleteTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */

    }

    protected void viewCompletedTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */

    }

    protected void makeTaskComplete() {


    }

    protected void editTask() {

        /**
         * stdout list, prompt user for
         */

    }

    protected void deleteTask() {


    }

    /**
     * There should always be a way for the user to exit the program.
     */
    private void exitProgram() {

        System.out.println("\nThank you for using the Task Manager.");
        System.exit(13);
    }

    /**
     * Make sure there are no holes in error handling.
     */
    //error handling
    private void invalidEntry() {

        System.out.println("Invalid entry.");
    }
}
