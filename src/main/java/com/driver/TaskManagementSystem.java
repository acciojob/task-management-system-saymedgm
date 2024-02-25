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
		tasks = new HashSet<String>();
		completedTasks = new ArrayList<String>();
	}

	public void addTask(String taskName) {
		tasks.add(taskName);
		System.out.println("Task '" + taskName + "' added successfully.");
	}

	public void markTaskAsCompleted(String taskName) {
		if (tasks.contains(taskName)) {
			tasks.remove(taskName);
			completedTasks.add(taskName);
			System.out.println("Task '" + taskName + "' marked as completed.");
		} else {
			System.out.println("Task '" + taskName + "' not found.");
		}
	}

	public void displayAllTasks() {
		if (tasks.isEmpty() && completedTasks.isEmpty()) {
			System.out.println("No tasks found.");
		} else {
			System.out.println("Tasks to be completed:");
			for (String task : tasks) {
				System.out.println("- " + task);
			}

			System.out.println("\nCompleted tasks:");
			for (String completedTask : completedTasks) {
				System.out.println("- " + completedTask);
			}
		}
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