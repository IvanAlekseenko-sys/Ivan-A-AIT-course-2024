package homework_17.cube.model;

//Задача 2. Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра perimeter (сумма длин всех ребер), площади area (сумма площадей всех граней) и объема volume.
public class Cube {

    //fields
    int a;



    //constructor
    public Cube(int a) {
        this.a = a;
    }

    //getters and setters

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    //методы

    //периметр
    public static int perimeter(int a) {
        int perimeter = a * 12;
        return perimeter;
    }
   //площадь
    public static int area(int a) {
        int area = 6 * (a * a);
        return area;
    }
    //объем
    public static int volume (int a) {
        int volume = a * a * a;
        return volume;
    }

    @Override
    public String toString() {
        return "Cube{" +
                "Сторона = " + a +
                '}';
    }

}//end of class
