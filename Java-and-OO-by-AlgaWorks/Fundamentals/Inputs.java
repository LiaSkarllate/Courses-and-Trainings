package Fundamentals;
//Imports:
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your name: ");
        String name = input.nextLine();

        System.out.print("Type your weight: ");
        Double weight = input.nextDouble();

        System.out.print("Type your hight: ");
        Double hight = input.nextDouble();

        System.out.println("Hello, " + name + "!");

        System.out.println("Hello, " + name + ". Your IMC is " + (weight / (hight * hight)) + ".");
    }
}