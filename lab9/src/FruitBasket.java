import java.lang.reflect.Array;
import java.util.ArrayList;

public class FruitBasket {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println("Exercise 1");
        // 1. Initialization
        ArrayList<String> fruits = new ArrayList<String>();

        // 2. Addition
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");

        // Traversal
        System.out.println("ArrayList items:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Exercise 2
        System.out.println("\nExercise 2");
        // 1. Modification
        fruits.set(fruits.indexOf("Date"), "Dragon Fruit");

        // 2. Inspection
        System.out.println("ArrayList Size: " + fruits.size());
        System.out.println("ArrayList contains \"Banana\": " + fruits.contains("Banana"));

        // 3. Removal
        System.out.println("Removed \"Cherry\" from List.");
        fruits.remove("Cherry");
        System.out.println("List: " + fruits);

        // Exercise 3
        System.out.println("\nExercise 3");
        // 1. Sublist Creation
        fruits.add("Elderberry");
        fruits.add("Fig");
        fruits.add("Grape");
        fruits.add("Honeydew");

        ArrayList<String> subFruitBasket = new ArrayList<String>();
        for (int i = 2; i <= 5; i++) {
            subFruitBasket.add(fruits.get(i));
        }
        System.out.println("subFruitBasket: " + subFruitBasket + "\n");

        // 2. Search and Remove
        removeFruitByName(fruits, "Apple");

        // 3. Clearing the Basket
        fruits.clear();
        System.out.println("Fruits list size: " + fruits.size());
    }

    public static void removeFruitByName(ArrayList<String> list, String fruitName) {
        if (list.remove(fruitName)) {
            System.out.println(fruitName + " has been removed from list:");
            System.out.println(list);
        }
        else System.out.println(fruitName + " is not in the list.");
    }
}
