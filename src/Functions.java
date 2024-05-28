public class Functions {
    // a simple function that prints something on the screen and returns nothing
    // it has no parameters
    public static void printGreeting() {
        System.out.println("Hello! Welcome!");
    }

    // a function with parameters
    public static void printGreetingByName(String name, String surname) {
        System.out.println("Hello " + name + " " + surname);
    }

    // a function that calculates the sum of 3 numbers
    // it returns the sum
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }

    // a function that returns the value of pi and has no parameters
    public static double piValue() {
        final double PI = 3.14;
        return PI;
    }

    // the area of a rectangle
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    // average of 3 numbers
    public static double avgNumbers(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // the area of a circle
    public static double circleArea(double radius) {
        return piValue() * radius * radius;
    }

    // how many characters does the name + first name have
    public static int countCharacters(String name, String firstName) {
        return name.length() + firstName.length();
    }

    public static void main(String[] args) {
        printGreeting();

        printGreetingByName("Bogdan", "Sandu");

        int sum = addNumbers(3, 14, 9);
        System.out.println(sum);
        System.out.println(addNumbers(18, 7, 12));

        System.out.println(piValue());

        System.out.println(rectangleArea(14, 12.5));

        System.out.println(avgNumbers(9, 12, 7));

        System.out.println(circleArea(5));

        System.out.println(countCharacters("Bogdan", "Sandu"));
    }
}
