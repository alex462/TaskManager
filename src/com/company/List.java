package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/*
LIST: This class will hold all methods for both the Main Menu and the Edit Menu.
 */

public class List {

    public MainMenu mainMenu;


    public List(MainMenu mainMenu) {
        this.mainMenu = mainMenu;
    }

    Task task = new Task();

    private Scanner input = new Scanner(System.in);

    protected List<String> allTasks = new ArrayList<>();
    protected List<String> completedTasks = new ArrayList<>();
    protected List<String> uncompletedTasks = new ArrayList<>();


    protected void createTask(){


    }

    protected void viewAllTasks(){


    }
}
