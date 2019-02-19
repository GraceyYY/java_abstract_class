package travelPlan;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Traveler(new Car()).executeStrategy(500));
        System.out.println(new Traveler(new Train()).executeStrategy(500));
        System.out.println(new Traveler(new Bus()).executeStrategy(500));
        System.out.println(new Traveler(new Airplane()).executeStrategy(500));
    }
}
