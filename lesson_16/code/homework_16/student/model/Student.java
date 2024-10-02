package homework_16.student.model;

//Создать класс Студент (Student) с приватными полями:
//id
//имя
//фамилия
//год рождения
//специализация
//Стандартные методы:
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод display.
//Дополнительные методы:
//учиться
//взять отпуск
//сдать экзамен
//...
public class Student {
    //field
    private int id;
    private String name;
    private String surname;
    private int yearOfBirth;
    private String specialization;

    //constructor

    public Student(int id, String name, String surname, int yearOfBirth, String specialization) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.specialization = specialization;
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // display
    public String display() {
        return String.format("ID: %d, name: %s, surname: %s, year of birth: %d, specialization: %s", id, name, surname, yearOfBirth, specialization);
    }

    // additional methods
    public void study() {
        System.out.println(name + " " + surname + " is studying.");
    }

    public void takeVacation() {
        System.out.println(name + " " + surname + " is taking a vacation.");
    }

    public void passExam() {
        System.out.println(name + " " + surname + " has passed the exam.");
    }

    public void expell() {
        System.out.println(name + " " + surname + " was expelled");
    }


}//end of class
