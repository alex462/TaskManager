package com.company;

import java.util.Scanner;

/*
MAIN MENU: This class will output greeting to user, then basic/beginning functions of program:
1. Create task
2. View tasks
3. Exit task manager
 */
public class MainMenu {

    private Scanner input = new Scanner(System.in);

    protected void welcomePrompt(){

        System.out.println("\nWELCOME TO THE TASK MANAGER");
        startMenu();
    }

    protected void startMenu(){

        System.out.println("\nWhat would you like to do?\n" +
                "Enter the number corresponding to the action you choose:\n" +
                "1. Create a new task\n" +
                "2. View your tasks\n" +
                "3. Exit task manager");

        switch(input.nextLine()){

            case "1": //create a new task
                editMenu.createTask();

        }
    }
}
