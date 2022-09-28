package taskAllocator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class taskList {

	private static int assignedTask = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to your task Manager!\n");
		System.out.println("Please Enter your Position: ");
		String name = sc.next();
		System.out.println("Hello "+name);
		
		
		int choice;
		ArrayList<String> tasks = new ArrayList<>();
		
		do {
			//Display the Menu
			System.out.println("Please choose an option\n");
			System.out.println("1. Enter a task ");
			System.out.println("2. Remove a task ");
			System.out.println("3. Update a task ");
			System.out.println("4. List all tasks ");
			System.out.println("5. Exit");
			choice = sc.nextInt();
			
			
			switch(choice) {
			case 1:
				if (assignedTask == 3) {
					System.out.println("Max task limit reached, please try again");
					break;
				}
//				assignedTask++;
				System.out.println("Enter the task: ");
				String currentTask = sc.next();
				tasks.add(currentTask);
				System.out.println("Following task has been assigned "+tasks.get(assignedTask++));
				
				break;
			case 2:
				System.out.println("Enter the task name to be removed");
				String task = sc.next();
				boolean find = false;
				for (int i = 0; i < assignedTask; i++) {
					if (tasks.get(i).equals(task)) {
						find = true;
						tasks.remove(i);
						assignedTask--;
					}
				}
				if (find == false) {
					System.out.println("Task not found, please try again");
				} else {
					System.out.println("Task is successfully removed");
				}
				
				break;
			case 3:
				System.out.println("Enter the task name to be replaced with");
				String oldTask = sc.next();
				
				boolean oldTaskFound = false;
				for (int i =  0; i < assignedTask; i++) {
					if (tasks.get(i).equals(oldTask)) {
						System.out.println("Enter the new task name");
						String newTask = sc.next();
						tasks.set(i, newTask);
						oldTaskFound = true;
						break;
					}
				}
				if (oldTaskFound == false) {
					System.out.println("Task not found please try again");
				}
				break;
			case 4:
				System.out.println("List of task ");
				for (int i = 0; i < assignedTask; i++) {
					System.out.println(tasks.get(i));
				}
				break;
			case 5:
				System.out.println("Exit ");
				break;	
				}
			
		} while ( choice != 5);	
		
//		System.out.println("Please choose an option");
//		choice = input.nextLine();
	}

	
}
