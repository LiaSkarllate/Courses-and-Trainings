package Fundamentals;
public class TypePromotion {
    public static void main(String[] args) {
        //Variables:
        int x = 10;
        float y = 9.34f;
        float z = x / y; //This is a type promotion use;

        System.out.println(z);

        float pi = 3.14f;
        float radius = 5.3f;
        float area = radius * radius * pi;

        System.out.println(area);

        int area_truncated = (int) area;
        
        System.out.println(area_truncated);
    }
}