import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        // we declare a map
        Map<String,Integer> studentsGrades = new HashMap<>();

        // we add elements
        studentsGrades.put("Gigel", 10);
        studentsGrades.put("Costel", 9);
        studentsGrades.put("Ana", 10);

        // we find the grades
        System.out.println(studentsGrades.get("Ana"));

        // we update the values
        studentsGrades.replace("Costel", 10);
        System.out.println(studentsGrades.get("Costel"));

        // we find the size
        System.out.println(studentsGrades.size());

        // we remove values
        studentsGrades.remove("Gigel");
        System.out.println(studentsGrades);

        // we declare and initialize the map with values
        Map<String,Integer> months = new HashMap<>()
        {{
            put("Jan", 1);
            put("Feb", 2);
            put("Mar", 3);
        }};
    }
}
