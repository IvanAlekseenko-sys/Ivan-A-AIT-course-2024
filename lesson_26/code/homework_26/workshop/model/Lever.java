package homework_26.workshop.model;

public class Lever extends Detail {

    //fields
   private double power;

   //constructor
    public Lever(long barcode, double size, String material, String vendor, double weight, double power) {
        super(barcode, size, material, vendor, weight);
        this.power = power;
    }
    //getters and setters
    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }


}//end of class
