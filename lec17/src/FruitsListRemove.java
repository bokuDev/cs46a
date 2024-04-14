import java.util.ArrayList;

public class FruitsListRemove {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add(0, "Mango");
        fruits.add("Banana");
        fruits.remove(0);
        fruits.remove(fruits.indexOf("Banana"));

        System.out.println(fruits);
        System.out.println("Array's size: " + fruits.size());
    }
}