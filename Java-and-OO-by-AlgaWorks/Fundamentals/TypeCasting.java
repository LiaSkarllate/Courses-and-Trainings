package Fundamentals;
 public class TypeCasting {
    public static void main(String[] args) {
        //Variables:
        long number1 = 930145497155l;
        long number2 = 5l;
        
        //These are casting uses:
        int number1converted = (int) number1; //This is a lossy casting;
        int number2converted = (int) number2; //This is not a lossy casting.

        System.out.println("number1 = " + number1);
        System.out.println("number2 = " + number2);

        System.out.println("number1converted = " + number1converted);
        System.out.println("number2converted = " + number2converted);
    }
}