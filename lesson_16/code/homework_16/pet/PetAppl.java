package homework_16.pet;
//В классе PetAppl создать несколько экземпляров домашних животных.
// Отобразить прожитый день.

import homework_16.pet.model.Pet;

public class PetAppl {
    public static void main(String[] args) {
        Pet dog = new Pet(1,"Canis familiaris",5,"Pyos");
        Pet cat = new Pet(2,"Felis catus",3,"Ryzhik");
        Pet parrot = new Pet(3, "Psittaciformes",2,"Kesha");
        Pet hamster = new Pet(4,"Cricetus cricetus",1,"Homie");
        Pet hedgehog = new Pet(5,"Erinaceus europaeus", 4, "Sonic");

        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(parrot.toString());
        System.out.println(hamster.toString());
        System.out.println(hedgehog.toString());

        System.out.println();
        System.out.println("All day long: ");

        System.out.println();
        dog.pyosWalk();
        cat.ryzhikPlay();
        parrot.keshaSound();
        hamster.homieEat();
        hedgehog.sonicSleep();

        System.out.println("Everyone is going through their typical day.");

    }//end of main

}//end of class
