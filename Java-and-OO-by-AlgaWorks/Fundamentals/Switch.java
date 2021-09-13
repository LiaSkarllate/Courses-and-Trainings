package Fundamentals;
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //Objects:
        Scanner input = new Scanner(System.in);

        System.out.print("Type your number: ");
        int number = input.nextInt();

        switch(number) {
            case 1:
                System.out.println("Your due date is in January.");
                break;
            case 2:
                System.out.println("Your due date is in February.");
                break;
            default:
                System.out.println("You do not have to pay.");
                break;
        }

        System.out.println("number = " + number);
        input.close();
    }
}