package classwork_16.employee.model;

import classwork_16.car_object.model.Car;

//создадим класс Employee (работник):
//поля
//конструктор
//геттеры и сеттеры
//метод display
//создадим класс FirmaAppl, в котором:
//создаем объекты типа Employee
//определим зарплату и вычислим ее общую сумму.
public class Employee {
    //field
private int id;
private String name;
private String lastName;
private double salary;
private boolean gender;
private Car car;


//constructor
    public Employee(int id, String name, String lastName, double salary, boolean gender) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
    }
  //setters and getters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String display(){
        return String.format("ID: %d, name: %s, ;lastname: %s, salary: %.2f, gender: %s", id, name, lastName, salary, gender);
    }


}//end of class

