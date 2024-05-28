import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // we declare an empty list
        List<String> fruits = new ArrayList<>();

        // we add elements to the list
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // how to get elements
        System.out.println(fruits.get(2));

        // how to find the index of an element
        System.out.println(fruits.indexOf("banana"));

        // is the list empty?
        System.out.println(fruits.isEmpty());

        // we remove an element from the list
        fruits.remove("apple");

        // we find out the size of the list
        System.out.println(fruits.size());

        // we list the elements
        System.out.println(Arrays.toString(fruits.toArray()));

        // we remove all elements from the list
        fruits.clear();

        if (!fruits.isEmpty()){
            System.out.println("we have what to eat");
        } else {
            System.out.println("we don't have what to eat");
        }

        // we declare an immutable list and initialize it with values
        List<Integer> numbers = Arrays.asList(1, 14, 23);
        System.out.println(numbers);

        // we declare a dynamic list
        String[] flowers = {"Poppy", "Ageratum", "Catmint"};
        List<String> flowerList = new ArrayList<>(Arrays.asList(flowers));
        flowerList.add("Rose");
        System.out.println(flowerList);
    }
}
