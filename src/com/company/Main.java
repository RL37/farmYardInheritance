package com.company;

public class Main {

    public static void main(String[] args) {

        animal myNewAnimal = new animal("Betty", 6, "Fluffy");
        Cow myNewCow = new Cow("Dolly",3,"Spotty","Yesterday");

        
        System.out.println(myNewCow.toString());
    }
}
