package day5;

public class ShoppingMallApplication {



    public static void main(String[] args) {


        ShoppingMallDoor door1 = new ShoppingMallDoor();
        ShoppingMallDoor door2 = new ShoppingMallDoor();
        ShoppingMallDoor door3 = new ShoppingMallDoor();
        ShoppingMallDoor door4 = new ShoppingMallDoor();

        door1.personEntered();

        door3.personEntered();

        door2.personExited();

        door4.personExited();

//        System.out.println("Door 1 : " + door1.getCounter());
//        System.out.println("Door 2 : " + door2.getCounter());
//        System.out.println("Door 3 : " + door3.getCounter());
//        System.out.println("Door 4 : " + door4.getCounter());

        ShoppingMallDoor.printCounter();

        double e = ShoppingMallDoor.E;

        int a = 2;
        int b = 3;

        add(a, b);

        System.out.println(a); // 0, 2 , 2
        System.out.println(b); // 0, 3 , 3

        ShoppingMallDoor door5 = new ShoppingMallDoor();
        door5.setDoorName("Test");
        changeDoorName(door5);

        System.out.println(door5.getDoorName()); //

    }
    public  static void add(int x, int y){
        int c = x + y;
        x = 0;
        y = 0;
    }

    public static void changeDoorName(ShoppingMallDoor door){
        door.setDoorName("Door 5");
    }
}
