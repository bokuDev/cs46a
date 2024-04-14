import java.util.ArrayList;

public class FruitsList {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add(0, "Mango");
        fruits.add("Banana");
        System.out.println(fruits);
    }
}