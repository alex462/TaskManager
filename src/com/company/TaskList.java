package com.company;

//import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Scanner;

/*
TaskList: This class will hold all methods for both the Main Menu and the Edit Menu.
 */

public class TaskList {

    public Menu menu;

    protected TaskList(Menu menu) {
        this.menu = menu;
    }

    Task task = new Task();

    protected List<String> allTasks = new ArrayList<>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy HH:mm:ss");
    protected List<String> incompleteTasks = new ArrayList<>();
    protected List<String> completeTasks = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public TaskList(ArrayList<String> allTasks) {
        this.allTasks = allTasks;
    }

    public TaskList() {
    }

    protected void createTask() {

        /**
         * (createTask and addTask could be same method. differentiate with an if/else statement: if arraylist > 0, output "Would you like to ADD another task?"
         */

        System.out.println("\033[0;1m" + "CREATE A TASK");
        System.out.println("\033[0;1m" + "Task name: ");
        task.setTaskName(input.nextLine());
        System.out.println("\033[0;1m" + "Task description: ");
        task.setTaskDescription(input.nextLine());
        System.out.println("\033[0;1m" + "Deadline (MM/DD/YY): ");
        task.setDeadline(input.next());
        System.out.println("\033[0;1m" + "Is this task a priority? (true/false): ");
        task.setPriority(input.nextBoolean());
        System.out.println("\033[0;1m" + "Additional notes: ");
        input.nextLine();
        task.setOtherNotes(input.nextLine());
        task.setComplete(false);

        //set task as one entire object for array list purposes
        task.setEntireTask(task.getTaskName(), task.getTaskDescription(), task.getDeadline(), task.isPriority(), task.getOtherNotes(), task.isComplete());

        //add all data for task to arraylist
        allTasks.add(task.getTaskName());
        incompleteTasks.add(task.getTaskName());


        //output task summation and confirmation to user
        System.out.println("\033[0;1m" + "\nHere is the task you have created:\n");
        System.out.println("Task Name: \033[0;0m" + task.getTaskName() +"\033[0;1m" + "\nDescription: \033[0;0m" + task.getTaskDescription() +"\033[0;1m" + "\nComplete by: \033[0;0m" + task.getDeadline() + "\033[0;1m" + "\nPriority task: \033[0;0m" + task.isPriority() + "\033[0;1m" + "\nAdditional notes: \033[0;0m" + task.getOtherNotes());

        System.out.println("\033[0;1m" + "\nYou may edit, delete, or mark this task as complete from the TASK EDITING MENU.\nYou may view this task's details by selecting the 'View your tasks' option from the MAIN MENU.");

        /**
         * STILL NEED TO FIX PRIORITY OUTPUT
         */

        menu.mainMenu();
    }

    protected void viewAllTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */

        System.out.println("\033[0;1m" + "ALL TASKS");

        int position = 1;
        for (int i = 0; i < allTasks.size(); i++) {
            System.out.println(position + ". " + allTasks.get(i) + " ");
            position++;
        }
    }

    protected void viewIncompleteTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */
        System.out.println("\033[0;1m" + "INCOMPLETE TASKS");

        int position = 1;
        for (int i = 0; i < incompleteTasks.size(); i++) {
            System.out.println(position + ". " + incompleteTasks.get(i) + " ");
            position++;
        }
    }

    protected void viewCompletedTasks() {

        /**
         * inside this code, there should always be an option for the user to select any task and view its details
         */
        System.out.println("\033[0;1m" + "COMPLETED TASKS");

//        int position = 1;
//        for (int i = 0; i < completedTasks.size(); i++) {
//            System.out.println(position + ". " + completedTasks.get(i) + " ");
//            position++;
//        }
    }

    protected void makeTaskComplete() {



    }

    protected void editTask() {

        /**
         * stdout TaskList, prompt user for
         */

    }

    protected void deleteTask() {

        System.out.println("Enter the number that corresponds to the task you would like to delete from your task list: ");
        viewAllTasks();
        String tempTask = allTasks.get(input.nextInt() - 1);
        System.out.println(tempTask + " has been removed from your task list.");
        allTasks.remove(tempTask);
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
