package homework_31.animals;

import java.util.Objects;

public class Animals implements Comparable<Animals> {

    //fields
    int id;
    String type;
    double weight;
    int height;
    String diet;

    public Animals(int id, String type, double weight, int height, String diet) {
        this.id = id;
        this.type = type;
        this.weight = weight;
        this.height = height;
        this.diet = diet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animals animals)) return false;
        return id == animals.id && Double.compare(weight, animals.weight) == 0 && height == animals.height && Objects.equals(type, animals.type) && Objects.equals(diet, animals.diet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, weight, height, diet);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animals{");
        sb.append("id=").append(id);
        sb.append(", type='").append(type).append('\'');
        sb.append(", weight=").append(weight);
        sb.append(", height=").append(height);
        sb.append(", diet='").append(diet).append('\'');
        sb.append('}');
        return sb.toString();
    }


    @Override
    public int compareTo(Animals o) {
       // return this.getId() - o.getId();
        return Integer.compare(this.getId(),o.getId());
    }
}//end of class
