package homework_45.to_do_list;

import homework_45.to_do_list.dao.ToDoListDao;
import homework_45.to_do_list.dao.ToDoListDaoImpl;
import homework_45.to_do_list.model.Task;

import java.util.Scanner;

public class ToDoListAppl {
    public static void main(String[] args) {
        ToDoListDao todoList = new ToDoListDaoImpl();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Add task");
            System.out.println("2. View tasks");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); //чтобы не перескакивало выбор

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    int id = todoList.getAllTasks().size() + 1; // Генерация ID
                    todoList.addTask(new Task(id, description)); // Добавляем задачу
                    System.out.println("Task added!");
                    break;
                case 2:
                    System.out.println("Your tasks:");
                    todoList.getAllTasks().forEach(System.out::println);
                    break;
                case 3:
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
