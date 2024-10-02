package homework_16.pet.model;
//Создать класс Pet (Домашнее животное) с приватными полями:
//id
//вид
//возраст
//кличка
//Стандартные методы:
//
//конструктор на все поля;
//геттеры и сеттеры на все поля;
//метод toString.
//Дополнительные методы:
//
//спать
//есть
//делать звук
//играть
//гулять

public class Pet {

    //field
    private int id;
    private String species;
    private int age;
    private String nickname;

    //constructor
    public Pet(int id, String species, int age, String nickname) {
        this.id = id;
        this.species = species;
        this.age = age;
        this.nickname = nickname;
    }

    // getters and setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", nickname='" + nickname + '\'' +
                '}';
    }

    public void sonicSleep() {
        System.out.println("Sonic is sleeping");
    }
    public void homieEat() {
        System.out.println("Homie is eating");
    }
    public void keshaSound() {
        System.out.println("Kesha is making sounds");
    }
    public void ryzhikPlay() {
        System.out.println("Ryzhik is playing");
    }
    public void pyosWalk() {
        System.out.println("Pyos is walking");
    }

}//end of class
