package homework_45.compareFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.
public class CompareFileAppl {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Wrong number of arguments");
            return;
        }
        System.out.println("source file: " + args[0]);
        System.out.println("destination file: " + args[1]);

        File file1 = new File(args[0]);
        File file2 = new File(args[1]);

        if (file1.length() != file2.length()) {
            System.out.println("Files are not identical. Different lengths");
            return;
        }

        try (FileInputStream fis1 = new FileInputStream(args[0]);
             FileInputStream fis2 = new FileInputStream(args[1])) {
//            if (fis1.available() != fis2.available()) {
//                System.out.println("Files are not identical. Different lengths");
//                return;
//            }
            int byte1;
            int byte2;
            //считываем файлы по одному байту и сравниваем
            while ((byte1 = fis1.read()) != -1 && (byte2 = fis2.read()) != -1) {
                if (byte1 != byte2) {
                    System.out.println("Files are not identical. Different content");
                    return;
                }
            }
            System.out.println("Files are identical");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}

