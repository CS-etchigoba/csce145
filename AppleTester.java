//Everlast Chigoba
public class AppleTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the apple tester");

        // Testing Default Constructor
        System.out.println("\nCreating a default apple");
        Apple apple1 = new Apple();
        System.out.println("Printing the default apple's value");
        System.out.println(apple1);

        // Testing Parameterized Constructor with Valid Values
        System.out.println("\nCreating another apple");
        System.out.println("Setting the new apple's values to the following, valid values");
        System.out.println("\"Granny Smith 0.75 0.99\"");
        Apple apple2 = new Apple("Granny Smith", 0.75, 0.99);
        System.out.println("Printing the new apple's values");
        System.out.println(apple2);

        // Testing Parameterized Constructor with Invalid Values
        System.out.println("\nCreating another default apple");
        Apple apple3 = new Apple();
        System.out.println("Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
        apple3.setType("iPad");
        apple3.setWeight(2.5);
        apple3.setPrice(-200);
        System.out.println("Printing the newest apple's values which should not have changed from the default values");
        System.out.println(apple3);

        // Testing the equals method
        System.out.println("\nChecking if the first and last apple have the same values.");
        System.out.println(apple1.equals(apple3));
    }
}
