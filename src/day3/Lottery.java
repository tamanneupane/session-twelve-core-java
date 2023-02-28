package day3;

import java.util.Random;

public class Lottery {

    public static void main(String[] args) {

        Random random1 = new Random();

        int firstNumber = random1.nextInt(100);
        int secondNumber = random1.nextInt(100);
        int thirdNumber = random1.nextInt(100);
        int fourthNumber = random1.nextInt(100);
        int fifthNumber = random1.nextInt(100);
        int sixthNumber = random1.nextInt(100);

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
        System.out.println(fourthNumber);
        System.out.println(fifthNumber);
        System.out.println(sixthNumber);
    }
}
