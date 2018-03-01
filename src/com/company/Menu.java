package com.company;

import java.util.Scanner;

//MENU CLASS: Holds 2 methods: mainMenu() and editMenu(), both of which hold directions for user and switch statements that invoke correlating methods from LIST CLASS. Users may create, delete, edit, view, and mark tasks complete. They may also switch between the 2 menu screens and/or exit the program at any time.

public class Menu {

    private TaskList taskList = new TaskList(this);

    private Scanner input = new Scanner(System.in);

    protected void welcomePrompt() {

        System.out.println("\nWELCOME TO THE TASK MANAGER\n");
        mainMenu();
    }

    /*
MAIN MENU: This method will output greeting to user, then basic/beginning functions of program:
1. Create task
2. View tasks
3. Exit task manager
When viewing any list of tasks, the user will have the option to select a specific task and view its details.
 */

    //method holds output main menu to user for adding tasks and viewing all tasks.
    //also holds switch stmt for user input to toggle these actions
    protected void mainMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nMAIN MENU: What would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. Create a new task\n" +
                    "2. View your tasks\n" +
                    "3. Go to the task editing menu\n" +
                    "4. Exit task manager");

            switch (input.nextLine()) {

                case "1": //create new task
                    taskList.createTask();
                    isValidInput = true;
                    break;

                case "2": //view tasks
                    taskList.viewAllTasks();
                    taskListMenu();
                    isValidInput = true;
                    break;

                case "3": //go to editing menu
                    editTasksMenu();
                    isValidInput = true;
                    break;

                case "4": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect input
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    /*
EDIT MENU: This menu outputs editing options to user concerning their already existing tasks (which they have added from the Main Menu). They will also have different viewing options from this menu. The edit menu will initialize when option (2. view tasks) in the main menu is selected; the user's tasks will be listed then the following options will be listed:
1. view incomplete tasks
2. view completed tasks
3. mark task/s complete
4. edit tasks
5. delete tasks
6. return to main menu
7. exit program
When viewing any list of tasks, the user will have the option to select a specific task and view its details.
 */

    private void editTasksMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nTASK EDITING MENU: What would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. Add a new task\n" +
                    "2. Mark tasks as complete\n" +
                    "3. Edit tasks\n" +
                    "4. Delete tasks\n" +
                    "5. Return to the main menu\n" +
                    "6. Exit task manager");

            switch (input.nextLine()) {

                case "1": //add new task
                    //same method ass create new task
                    taskList.createTask();
                    isValidInput = true;
                    break;

                case "2": //mark tasks complete
                    taskList.makeTaskComplete();
                    isValidInput = true;
                    break;

                case "3": //edit task
                    taskList.editTask();
                    isValidInput = true;
                    break;

                case "4": //delete task
                    taskList.deleteTask();
                    isValidInput = true;
                    break;

                case "5": //main menu
                    mainMenu();
                    isValidInput = true;
                    break;

                case "6": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect input
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    private void taskListMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nYOUR TASK LISTS: What would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. View your incomplete tasks\n" +
                    "2. View your completed tasks\n" +
                    "3. Return to the main menu\n" +
                    "4. Return to the task editing menu\n" +
                    "5. Exit task manager");

            switch (input.nextLine()) {

                case "1": //view incomplete
                    taskList.viewIncompleteTasks();
                    viewDetailsMenu();
                    isValidInput = true;
                    break;

                case "2": //view completed
                    taskList.viewCompletedTasks();
                    viewDetailsMenu();
                    isValidInput = true;
                    break;

                case "3": //main menu
                    mainMenu();
                    isValidInput = true;
                    break;

                case "4": //edit tasks menu
                    editTasksMenu();
                    isValidInput = true;
                    break;

                case "5": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect input
                    invalidEntry();
                    isValidInput = false;
            }
        }
    }

    private void viewDetailsMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nWhat would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. View the details of one of the tasks in this list?\n" +
                    "2. View a different list of tasks\n" +
                    "3. Return to the main menu\n" +
                    "4. Return to the task editing menu\n" +
                    "5. Exit task manager");

            switch (input.nextLine()) {

                case "1": //view task details
                    taskList.viewTaskDetails();
                    isValidInput = true;
                    break;

                case "2": //task list menu
                    viewDetailsMenu();
                    isValidInput = true;
                    break;

                case "3": //main menu
                    mainMenu();
                    isValidInput = true;
                    break;

                case "4": //edit tasks menu
                    editTasksMenu();
                    isValidInput = true;
                    break;

                case "5": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                default: //incorrect input
                    invalidEntry();
                    isValidInput = false;
            }
        }
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

