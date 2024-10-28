package homework_33.to_do_list;

import java.util.Scanner;

public class ToDoList {
    public class TodoListApp {
        private static ToDoListEnum[] menuItems = ToDoListEnum.values();

        public static void printMenu() {
            System.out.println("Меню:");
            for (int i = 0; i < menuItems.length; i++) {
                System.out.println((i + 1) + ". " + menuItems[i].getDescription());
            }
        }
    }
}
