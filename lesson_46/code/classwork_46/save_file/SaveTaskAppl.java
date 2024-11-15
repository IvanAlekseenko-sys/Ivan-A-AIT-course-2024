package classwork_46.save_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SaveTaskAppl {

    public static void main(String[] args) {

        LocalDate now = LocalDate.now();

        Task t1 = new Task("task1", now.minusDays(3));
        Task t2 = new Task("task2", now.minusDays(2));

        List<Task> taskList = new ArrayList<>();
        taskList.add(t1);
        taskList.add(t2);

        // отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tasks.dat"))) {

            oos.writeObject(taskList);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
