import java.util.ArrayList;

public class AnimalsList {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Elephant");
        System.out.println(animals);

        ArrayList<String> points = animals;
        points.add("xd");
        System.out.println(points);
        System.out.println(animals);
        
    }
}