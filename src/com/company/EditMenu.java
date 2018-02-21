package com.company;

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

import java.util.Scanner;

public class EditMenu {




    private Scanner input = new Scanner(System.in);


        //method holds output menu to user for editing tasks.
        //also holds switch stmt for user input to toggle editing actions
    protected void editTasksMenu() {

        boolean isValidInput = false;
        while (!isValidInput) {

            System.out.println("\nWhat would you like to do?\n" +
                    "Enter the number corresponding to the action you choose:\n" +
                    "1. View your incomplete tasks\n" +
                    "2. View your completed tasks\n" +
                    "3. Mark tasks as complete\n" +
                    "4. Edit tasks\n" +
                    "5. Delete tasks\n" +
                    "6. Return to the main menu\n" +
                    "7. Exit task manager");

            switch(input.nextLine()){

                case "1": //view incomplete tasks
                    list.viewIncompleteTasks();
                    isValidInput = true;
                    break;

                case "2": //view completed tasks
                    list.viewCompletedTasks();
                    isValidInput = true;
                    break;

                case "3": //mark tasks complete
                    list.makeTaskComplete();
                    isValidInput = true;
                    break;

                case "4": //edit task
                    list.editTask();
                    isValidInput = true;
                    break;

                case "5": //delete task
                    list.deleteTask();
                    isValidInput = true;
                    break;

                case "6": //main menu
                    mainMenu.startMenu();
                    isValidInput = true;
                    break;

                case "7": //exit
                    exitProgram();
                    isValidInput = true;
                    break;

                    default: //incorrect input
                        invalidEntry();
                        isValidInput = false;
            }
        }
    }

    private void exitProgram(){

        System.out.println("\nThank you for using the Task Manager.");
        System.exit(13);
    }

        //error handling
    private void invalidEntry(){

        System.out.println("Invalid entry.");
    }
}
