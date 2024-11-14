package classwork_45.file_copy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//пишем утилиту для копирования файлов
//имена файлов передаются в аргументах командной строки
public class CopyImageAppl {
    public static void main(String[] args) {
        //String[] args - он отвечает за получение аргументов
        //проверяется, что аргументов именно 2
        if (args.length != 2) {
            System.out.println("Wrong numbers of argument.");
        }
        //print files names
        System.out.println("source file: " + args[0]);
        System.out.println("destination file: " + args[1]);

        // читать из файла пока != -1, пишем во второй файл.
        try (FileInputStream fin = new FileInputStream(args[0])) {
            try (FileOutputStream fout = new FileOutputStream(args[1])) {

                //  читать из файла пока != -1, пишем в 1-й файл
                int a = fin.read(); // read 1st byte
                while (a != -1) {
                    fout.write(a); //пишем в файл
                    a = fin.read(); // читаем из файла
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
