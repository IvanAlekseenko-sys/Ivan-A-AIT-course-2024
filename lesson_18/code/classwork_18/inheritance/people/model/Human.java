package classwork_18.inheritance.people.model;

public class Human {
   //fields
    boolean gender; //default modifier - not present
    double height;
    double weight;
    String race;
    String country;
    String eyeColor;

//constructor
    public Human(boolean gender, double height, double weight, String race, String country, String eyeColor) {
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.race = race;
        this.country = country;
        this.eyeColor = eyeColor;
    }
  //toString
    @Override
    public String toString() {
        return "Human{" +
                "gender=" + gender +
                ", height=" + height +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                ", country='" + country + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }


}//end of class
