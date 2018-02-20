package com.company;

import java.util.Scanner;

/*
MAIN MENU: This class will output greeting to user, then basic/beginning functions of program:
1. Create task
2. View tasks
3. Exit task manager
 */

public class MainMenu {

    private EditMenu editMenu = new EditMenu(this);
    private List list = new List(this);
    private Scanner input = new Scanner(System.in);

    protected void welcomePrompt() {

        System.out.println("\nWELCOME TO THE TASK MANAGER");
        startMenu();
    }

    protected void startMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nWhat would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. Create a new task\n" +
                    "2. View your tasks\n" +
                    "3. Go to the task editing menu\n" +
                    "4. Exit task manager");

            switch (input.nextLine()) {

                case "1": //create new task
                    list.createTask();
                    isValidInput = true;
                    break;

                case "2": //view tasks
                    list.viewAllTasks();
                    isValidInput = true;
                    break;

                case "3": //go to edit menu
                    editMenu.editTasksMenu();
                    isValidInput = true;
                    break;

                case "4": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                    default:
                        invalidEntry();
                        isValidInput = false;
            }
        }
    }

        private void exitProgram(){

            System.out.println("\nThank you for using the Task Manager.");
            System.exit(13);
        }

        private void invalidEntry(){

            System.out.println("Invalid entry.");
        }

}

