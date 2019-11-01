package io.zipcoder.polymorphism;

import java.util.Scanner;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pets do you have");
        int numberOfPets = Integer.parseInt(scanner.nextLine());

        String[] petTypes = new String[numberOfPets];
        for (int i = 0; i < petTypes.length; i++) {
            System.out.println("What type of pet is pet #" + (i + 1));
            petTypes[i] = scanner.nextLine();

            System.out.println("What is this pet's name?");
            String petName = scanner.nextLine();
        }




    }
}
