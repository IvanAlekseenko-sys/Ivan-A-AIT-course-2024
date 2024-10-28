//package homework_27.marathon.Pets_marathon.model;
//
//public class Dog extends Pet {
//
//    private String порода;
//    private int рост;
//    private double вес;
//
//    public Dog (int id, String вид, int возраст, String кличка, String порода, int рост, double вес) {
//        super(id, вид, возраст, кличка);
//        this.порода = порода;
//        this.рост = рост;
//        this.вес = вес;
//    }
//
//    public String getПорода() {
//        return порода;
//    }
//
//    public void setПорода(String порода) {
//        this.порода = порода;
//    }
//
//    public int getРост() {
//        return рост;
//    }
//
//    public void setРост(int рост) {
//        this.рост = рост;
//    }
//
//    public double getВес() {
//        return вес;
//    }
//
//    public void setВес(double вес) {
//        this.вес = вес;
//    }
//
//    @Override
//    public String toString() {
//        return "Dog{" +
//                "порода='" + порода + '\'' +
//                ", рост=" + рост +
//                ", вес=" + вес +
//                "} " + super.toString();
//    }
//
//    public void voice(){
//        System.out.println(getКличка()+ " издает звук Гав-Гав");
//    }
//
//}
