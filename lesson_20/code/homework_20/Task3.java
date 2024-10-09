package homework_20;

//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.
public class Task3 {
    public static void main(String[] args) {
        // Проверяем переданы ли аргументы, если нет - выводим по дефолту макс/мин
        if (args.length == 0) {
            System.out.println("Нет аргументов. Вывод значений по умолчанию:");
            System.out.println("Максимальное значение byte = " + Byte.MAX_VALUE);
            System.out.println("Минимальное значение byte = " + Byte.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение short = " + Short.MAX_VALUE);
            System.out.println("Минимальное значение short = " + Short.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение char = " + (int) Character.MAX_VALUE);
            System.out.println("Минимальное значение char = " + (int) Character.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение int = " + Integer.MAX_VALUE);
            System.out.println("Минимальное значение int = " + Integer.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение long = " + Long.MAX_VALUE);
            System.out.println("Минимальное значение long = " + Long.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение float = " + Float.MAX_VALUE);
            System.out.println("Минимальное значение float = " + Float.MIN_VALUE);
            System.out.println("-------------------------------------------------");
            System.out.println("Максимальное значение double = " + Double.MAX_VALUE);
            System.out.println("Минимальное значение double = " + Double.MIN_VALUE);
            return;
        }
        //если аргументы переданы
        for (int i = 0; i < args.length; i++) {
            String arg = args[i]; // Получаем аргумент по индексу
            boolean found = false; // переменная отслеживаем найден ли тип да/нет

            // Проверяем каждый тип
            if (arg.equals("byte")) {
                System.out.println("Максимальное значение byte = " + Byte.MAX_VALUE);
                System.out.println("Минимальное значение byte = " + Byte.MIN_VALUE);
                found = true;
            } else if (arg.equals("short")) {
                System.out.println("Максимальное значение short = " + Short.MAX_VALUE);
                System.out.println("Минимальное значение short = " + Short.MIN_VALUE);
                found = true;
            } else if (arg.equals("char")) {
                System.out.println("Максимальное значение char = " + (int) Character.MAX_VALUE);
                System.out.println("Минимальное значение char = " + (int) Character.MIN_VALUE);
                found = true;
            } else if (arg.equals("int")) {
                System.out.println("Максимальное значение int = " + Integer.MAX_VALUE);
                System.out.println("Минимальное значение int = " + Integer.MIN_VALUE);
                found = true;
            } else if (arg.equals("long")) {
                System.out.println("Максимальное значение long = " + Long.MAX_VALUE);
                System.out.println("Минимальное значение long = " + Long.MIN_VALUE);
                found = true;
            } else if (arg.equals("float")) {
                System.out.println("Максимальное значение float = " + Float.MAX_VALUE);
                System.out.println("Минимальное значение float = " + Float.MIN_VALUE);
                found = true;
            } else if (arg.equals("double")) {
                System.out.println("Максимальное значение double = " + Double.MAX_VALUE);
                System.out.println("Минимальное значение double = " + Double.MIN_VALUE);
                found = true;
            }

            // Если тип не найден
            if (!found) {
                System.out.println("Неверный тип");
            }
            System.out.println("-------------------------------------------------");
        }
    }//end of main


}//end of class
