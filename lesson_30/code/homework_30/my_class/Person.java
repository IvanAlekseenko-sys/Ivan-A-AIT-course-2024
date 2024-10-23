package homework_30.my_class;

import java.util.Objects;

//Придумайте класс МойКласс с полями типа:
//String
//int
//double например: Person - name, weight, age City - name, population, area ... или выберите тот, с которым вы делали проекты по Марафону.
//Выполните с набором объектов этого класса все то, что мы делали на занятии:
//сортировка по умолчанию
//сортировка по 2-м критериям
//поиск в массиве с помощью Arrays.binarySearch()
public class Person implements Comparable<Person> {


    String name;
    int age;
    double weight;

    public Person(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Double.compare(weight, person.weight) == 0 && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Person person) {
        return String.valueOf(this.name).compareTo(String.valueOf(person.name));
    }

}
