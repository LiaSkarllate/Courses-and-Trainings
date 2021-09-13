package Fundamentals;

 public class IncrementOperators {
    public static void main(String[] args) {
        //Variables:
        int number = 10;
        int number1 = 5;
        int number2 = 60;
        int number3;

        number += 3; //number = number + 3;
        number -= 2; //number = number - 2;
        number *= 3; //number = number * 3;
        number /= 3; //number = number / 3;
        number %= 5; //number = number % 3;

        System.out.println("number = " + number);

        System.out.println("number1 (before) = " + number1);
        number1 =+ 10; //number1 = number1++;
        System.out.println("number1 (after) = " + number1);

        number3 = number2++;
        System.out.println("number2 = " + number2);
        System.out.println("number3 = " + number3);
    }
}