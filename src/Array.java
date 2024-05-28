public class Array {
    public static void main(String[] args) {
        // declaration and memory allocation
        int[] grades = new int[5]; // 0, 0, 0, 0, 0
        System.out.println(grades[1]);
        grades[0] = 10;
        grades[1] = 8;

        // declaration and initialization when we know the values
        String[] students = {"Florin", "Dan", "Gigi", "Ana", "Elena"};
        int[] numbers = {2, 12, 17, 7, 33};

        System.out.println(students[1]);
        students[1] = "Fane";
        System.out.println(students[1]);
        System.out.println(students.length);

        // to print all the time the last element regardless of size
        System.out.println("Last place: " + students[students.length -1]);
    }
}
