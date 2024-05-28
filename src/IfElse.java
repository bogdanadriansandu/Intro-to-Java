import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        // if
        System.out.println("I turn on the radio");
        // if I like the song, I turn up the volume
        boolean nice_song = true;
        if (nice_song) {
            System.out.println("I turn up the volume");
            System.out.println("I start humming the song");
        }
        System.out.println("I turn off the radio");

        // if else
        int number = 3;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        // if, else if, else
        // we take data from the keyboard
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hour: ");
        int hour = sc.nextInt();

        if (hour < 0) {
            System.out.println("Invalid hour. Negative hour.");
        } else if (hour <= 11) {
            System.out.println("Good morning!");
        } else if (hour <= 18) {
            System.out.println("Good afternoon!");
        } else if (hour <= 21) {
            System.out.println("Good evening!");
        } else if (hour <= 24) {
            System.out.println("Good night!");
        } else {
            System.out.println("Invalid hour. Hour greater than 24.");
        }

        // flow control
        //switch
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Select your option: ");
        int option = sc2.nextInt();

        switch (option) {
            case 0:
                System.out.println("Previous menu");
                break;
            case 1:
                System.out.println("Ro");
                break;
            case 2:
                System.out.println("En");
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
