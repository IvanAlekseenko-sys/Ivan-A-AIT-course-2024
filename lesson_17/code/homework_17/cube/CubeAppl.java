package homework_17.cube;

import homework_17.cube.model.Cube;

//Создать приложение CubeAppl, в котором создать несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class CubeAppl {
    public static void main(String[] args) {

        Cube cube = new Cube(10);
        System.out.println(cube.toString());
        int perimeter = Cube.perimeter(cube.getA());
        System.out.println("Периметр куба равен: " + perimeter);
        int area = Cube.area(cube.getA());
        System.out.println("Площадь куба равна: " + area);
        int volume = Cube.volume(cube.getA());
        System.out.println("Объем куба равен: " + volume);

        System.out.println();
        Cube cube1 = new Cube(13);
        System.out.println(cube1.toString());
        perimeter = Cube.perimeter(cube1.getA());
        System.out.println("Периметр куба равен: " + perimeter);
        area = Cube.area(cube1.getA());
        System.out.println("Площадь куба равна: " + area);
        volume = Cube.volume(cube1.getA());
        System.out.println("Объем куба равен: " + volume);

        System.out.println();
        Cube cube2 = new Cube(77);
        System.out.println(cube2.toString());
        perimeter = Cube.perimeter(cube2.getA());
        System.out.println("Периметр куба равен: " + perimeter);
        area = Cube.area(cube2.getA());
        System.out.println("Площадь куба равна: " + area);
        volume = Cube.volume(cube2.getA());
        System.out.println("Объем куба равен: " + volume);

    }//end of main


}//end of class
