package io.zipcoder.polymorphism;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have");
        int numberOfPets = Integer.parseInt(scanner.nextLine());

        Pet[] pets = new Pet[numberOfPets];

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What type of pet is pet #" + (i + 1));
            String petType = scanner.nextLine();

            System.out.println("What is this pet's name?");
            String petName = scanner.nextLine();

            switch (petType) {
                case "Dog":
                    pets[i] = new Dog(petName);
                    break;
                case "Cat":
                    pets[i] = new Cat(petName);
                    break;
                case "Bunny":
                    pets[i] = new Bunny(petName);
                    break;
                default:
                    System.out.println("Error");
                    break;
            }
        }

        Arrays.sort(pets);

        for (int i = 0; i < numberOfPets; i++) {
            System.out.print(pets[i].getClass().getSimpleName() + " " + pets[i].getName() + " says: ");
            System.out.println(pets[i].speak() + "\n");
        }

    }
}
