package day2.polymorphism;

// Compile Time
public class PolymorphismExample {

    public static void main(String[] args) {
//        PolymorphismExample example = new PolymorphismExample();
//        example.add(2,3);

        add(2, 3); // int
        add(2.0f, 3.0f); // float
        add(2.0, 3.0); // double
    }

    // Function Overloading

    public static void add(int a, int b){
        int temp = a + b;
        System.out.println(temp);
    }

    public static void add(float a, float b){
        float temp = a + b;
        System.out.println(temp);
    }

    public static void add(double a, double b){
        double temp = a + b;
        System.out.println(temp);
    }

}
