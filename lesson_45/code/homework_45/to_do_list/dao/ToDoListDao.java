package homework_45.to_do_list.dao;


import homework_45.to_do_list.model.Task;

import java.util.List;

public interface ToDoListDao {
    void addTask(Task task); // Добавление задачи
    List<Task> getAllTasks(); // Получение всех задач
}
