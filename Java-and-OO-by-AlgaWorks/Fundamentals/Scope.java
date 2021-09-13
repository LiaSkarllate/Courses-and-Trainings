package Fundamentals;

//Imports:
import java.util.Scanner;

public class Scope {
    public static void main(String[] args) {
        //Objects:
        Scanner input = new Scanner(System.in);
        String fatherName = "";

        System.out.print("Type your age: ");
        int age = input.nextInt();

        boolean canDrive = (age >= 16);

        if(canDrive){
            System.out.print("Type your father's name: ");
            /*String */fatherName = input.next(); //If blocks set up a new scope.
        }

        System.out.println("fatherName = " + fatherName);
        input.close();
    }
}