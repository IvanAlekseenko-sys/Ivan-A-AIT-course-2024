package classwork_46.employee_save_read;

import java.io.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl implements Serializable {
    public static void main(String[] args) {
        Address address1 = new Address("C1", "St1", 12, 10, 86356);
        Address address2 = new Address("C1", "St2", 21, 35, 86356);
        Employee e1 = new Employee(1, "Peter", LocalDate.of(2000, 4, 1), 5900, address1);
        Employee e2 = new Employee(2, "John", LocalDate.of(2000, 4, 10), 5800, address2);

        Set<Employee> firma = new HashSet<>();
        firma.add(e1);
        firma.add(e2);

//отправляем в файл
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.dat"))) {
            oos.writeObject(firma);



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
