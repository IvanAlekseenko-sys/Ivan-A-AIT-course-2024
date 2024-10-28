package homework_33.to_do_list;

import java.util.Scanner;

import static homework_33.to_do_list.ToDoList.TodoListApp.printMenu;

public class ToDoListAppl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            printMenu();
            System.out.println("Выберите пункт меню: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Вы выбрали: " + ToDoListEnum.ADD_TASK.getDescription());
                    flag = false;
                    break;
                case 2:
                    System.out.println("Вы выбрали: " + ToDoListEnum.SHOW_TASK.getDescription());
                    flag = false;
                    break;
                case 3:
                    System.out.println("Вы выбрали: " + ToDoListEnum.DELETE_TASK.getDescription() + " по её номеру");
                    flag = false;
                    break;
                case 4:
                    System.out.println("Вы выбрали: " + ToDoListEnum.EXIT.getDescription());
                    flag = false;
                    break;
                default:
                    System.out.println("Некорректный выбор. Пожалуйста, попробуйте снова.");
            }
        }
    }
}
