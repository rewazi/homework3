package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         enum Color {

            GREEN, RED, YELLOW, WHITE, BLACK
        }

        enum Animal {
             RAT, KINE, TIGER, HARE, DRAGON, SNAKE, HORSE, SHEEP, MONKEYS, CHICKENS, DOGS, PIGS
         }
        int startYear = 1984;


         Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        int difference = year - startYear;

        int animalIndex = difference % 12;
        if (animalIndex < 0) {
            animalIndex += 12;
        }

        int colorIndex = difference % 5;
        if (colorIndex < 0) {
            colorIndex += 5;
        }
        Animal animal = Animal.values()[animalIndex];
        Color color = Color.values()[colorIndex];

        System.out.println("Год " + color.toString().toLowerCase() + " " + animal.toString().toLowerCase());


    }
}