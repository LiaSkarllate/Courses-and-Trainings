package Fundamentals;
public class Wrappers {
    public static void main(String[] args) {
        //Variables:
        byte    number1 = 127;  //This type holds whole numbers from -128 to 127;
        short   number2 = 32767;//This type holds whole numbers from -32,768 to 32,767;
        int     number3 = 5;    //This type holds whole numbers from -2,147,483,648 to 2,147,483,647; 
        long    number4 = 500l; //This type holds whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        float   number5 = 5.5f; //This type holds fractional numbers and for stores 6 to 7 decimal digits;
        double  number6 = 5.6;  //This type holds fractional numbers and for stores 15 decimal digits;
        boolean number7 = true; //This type hold true or false values;
        char    number8 = 5;    //This type single character or ASCII values.

        Byte number1Wrapped = Byte.valueOf(number1);
        Short number2Wrapped = Short.valueOf(number2);
        Integer number3Wrapped = Integer.valueOf(number3);
        Long number4Wrapped = Long.valueOf(number4);
        Float number5Wrapped = Float.valueOf(number5);
        Double number6Wrapped = Double.valueOf(number6);
        Boolean number7Wrapped = Boolean.valueOf(number7);
        Character number8Wrapped = Character.valueOf(number8);
      
        //Converting a wrapper to the corresponding primitive type:
        byte i = number3Wrapped.byteValue();
        short j = number3Wrapped.shortValue();
        long m = number3Wrapped.longValue();
        float n = number3Wrapped.floatValue();

        //Converting a string to the corresponding primitive type:
        byte    number1Parsed = Byte.parseByte("5");
        short   number2Parsed = Short.parseShort("50");
        int     number3Parsed = Integer.parseInt("500");   
        long    number4Parsed = Long.parseLong("5000"); 
        float   number5Parsed = Float.parseFloat("50000.5"); 
        double  number6Parsed = Double.parseDouble("500000.5");
        boolean number7Parsed = Boolean.parseBoolean("true"); 

        Integer number3Boxed = 10; //This is a boxing use.
        int number3Unboxed = number3Boxed; //This is a unboxing use.
        
        System.out.println(number1Parsed);
        System.out.println(number2Parsed);
        System.out.println(number3Parsed);
        System.out.println(number4Parsed);
        System.out.println(number5Parsed);
        System.out.println(number6Parsed);
        System.out.println(number7Parsed);
    }
}