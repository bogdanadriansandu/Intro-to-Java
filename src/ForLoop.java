public class ForLoop {
    public static void main(String[] args) {
        // for
        // we print 101 dalmatians
        for (int i = 1; i <= 101; i++) {
            System.out.println("Dalmatian no " + i);
        }

        // iterate through an array by index
        int[] numbers = {3, 7, 3, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("The element has index " + i + " and value " + numbers[i]);
        }

        // for each
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
