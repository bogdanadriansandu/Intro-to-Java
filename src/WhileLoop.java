public class WhileLoop {
    public static void main(String[] args) {
        int litersOfGasoline = 10;

        while (litersOfGasoline > 0) {
            System.out.println("Vruum vruum!");
            litersOfGasoline -= 1;

            if (litersOfGasoline <= 3) {
                System.out.println("The red light turns on!");
            }
        }
        System.out.println("STOP! No more gasoline");
    }
}
