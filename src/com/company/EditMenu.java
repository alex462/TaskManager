package com.company;

/*
EDIT MENU: This menu outputs editing options to user concerning their already existing tasks (which they have added from the Main Menu). They will also have different viewing options from this menu. The edit menu will initialize when option (2. view tasks) in the main menu is selected; the user's tasks will be listed then the following options will be listed:
1. view uncompleted tasks
2. view completed tasks
3. mark task/s complete
4. view task details
5. edit tasks
6. delete tasks
7. return to main menu
8. exit program
 */

public class EditMenu {

    public MainMenu mainMenu;

    public EditMenu(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    protected void editTasksMenu(){

        System.out.println("What would you like to do?");
    }

    private void exitProgram(){

        System.out.println("\nThank you for using the Task Manager.");
        System.exit(13);
    }

    private void invalidEntry(){

        System.out.println("Invalid entry.");
    }
}
