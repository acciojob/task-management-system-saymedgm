package com.driver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class TaskManagementSystem {
	 private Set<String> tasks;
	    private List<String> completedTasks;

	    public TaskManagementSystem() {
	        // your code goes here
	    }

	    public void addTask(String taskName) {
	    	 // your code goes here
	    }

	    public void markTaskAsCompleted(String taskName) {
	    	 // your code goes here
	    }

	    public void displayAllTasks() {
	    	 // your code goes here
	    }

	    public static void main(String[] args) {
	        TaskManagementSystem taskSystem = new TaskManagementSystem();
	        Scanner scanner = new Scanner(System.in);

	        boolean exit = false;
	        while (!exit) {
	            System.out.println("1. Add Task");
	            System.out.println("2. Mark Task as Completed");
	            System.out.println("3. Display All Tasks");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Task Name: ");
	                    scanner.nextLine(); // Consume newline character
	                    String taskName = scanner.nextLine();
	                    taskSystem.addTask(taskName);
	                    break;

	                case 2:
	                    System.out.print("Enter Task Name to mark as completed: ");
	                    scanner.nextLine(); // Consume newline character
	                    String completedTaskName = scanner.nextLine();
	                    taskSystem.markTaskAsCompleted(completedTaskName);
	                    break;

	                case 3:
	                    taskSystem.displayAllTasks();
	                    break;

	                case 4:
	                    exit = true;
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	        scanner.close();
	    }
}
