package homework_26.workshop.model;

public class Gear extends Detail{

    //fields
   private double radius;
   private int tooth;


   //constructor
    public Gear(long barcode, double size, String material, String vendor, double weight, double radius, int tooth) {
        super(barcode, size, material, vendor, weight);
        this.radius = radius;
        this.tooth = tooth;
    }
     //getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getTooth() {
        return tooth;
    }

    public void setTooth(int tooth) {
        this.tooth = tooth;
    }

}
