package homework_45.to_do_list.dao;


import homework_45.to_do_list.model.Task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ToDoListDaoImpl implements ToDoListDao {
    private List<Task> tasks = new ArrayList<>();

    @Override
    public void addTask(Task task) {
        tasks.add(task);
        saveTasksToFile(); // Сохраняем задачи в файл при добавлении
    }

    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    //сохранение задачи в файл
    private void saveTasksToFile() {
        try (FileWriter writer = new FileWriter("file.txt",true)) { // true включает append и в этом случае программа будет добавлять новую информацию в файл при добавлении задач, а не перезаписывать то, что уже было записано
            for (Task task : tasks) {
                writer.write(task.toString()); // Записываем описание задачи в файл
                writer.write(System.lineSeparator()); // Добавляем новую строку
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

