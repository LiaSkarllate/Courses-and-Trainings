package Fundamentals;

 public class PrimitiveTypes {
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
        
        System.out.println("byte = "    + Byte.SIZE/8       + " bytes");
        System.out.println("short = "   + Short.SIZE/8      + " bytes");
        System.out.println("int = "     + Integer.SIZE/8    + " bytes");
        System.out.println("long = "    + Long.SIZE/8       + " bytes");
        System.out.println("float = "   + Float.SIZE/8      + " bytes");
        System.out.println("double = "  + Double.SIZE/8     + " bytes");
        System.out.println("boolean = " + 1                 + " bit");
        System.out.println("char = "    + Character.SIZE/8  + " bytes");
    }
}