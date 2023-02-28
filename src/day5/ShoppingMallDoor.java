package day5;

public class ShoppingMallDoor {

    public static final double E = 2.7182818284590452354;
    private static int counter;
    private String doorName;

    public void personEntered(){
        counter = counter + 1;
    }

    public void personExited(){
        counter = counter - 1;
    }

    public int getCounter() {
        return counter;
    }

    public void setDoorName(String doorName) {
        this.doorName = doorName;
    }

    public String getDoorName() {
        return doorName;
    }

    public static void printCounter(){
        System.out.println(counter);
    }


}
