package homework;

//  Проверить существование треугольника
public class Triangle {
    public static void main(String[] args) {

        double side1 = 5.0; //сторона 1
        double side2 = 7.0; //сторона 2
        double side3 = 10.0; //сторона 3

        // Проверяем существует ли треугольник
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            System.out.println("Треугольник с заданными сторонами существует.");
        } else {
            System.out.println("Треугольник с заданными сторонами не существует.");
        }
    }//end of main
}// end of class