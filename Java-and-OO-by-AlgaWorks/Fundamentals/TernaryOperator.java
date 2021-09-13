package Fundamentals;

//Imports:
import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //Objects:
        Scanner input = new Scanner(System.in);

        System.out.print("Type your biological gender (one for male and others number for female): ");
        
        char gender = input.nextShort() == 1 ? 'M' : 'F';

       System.out.println("gender = " + gender);
       input.close();
    }
}