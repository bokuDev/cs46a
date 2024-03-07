/**
 * Represents a Circle
 * @author Canhui Huang
 */
public class Circle {
    private double radius;

    /**
     * Constructs a new Circle
     * @param radius the radius of the circle
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Computes and returns the area of the circle
     * @return the area of the circle as a double
     */
    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Computes and returns the circumference of the circle
     * @return the circumference of the circle as a double
     */
    public double circumference() {
        return Math.PI * this.radius * 2;
    }

    /**
     * Display details of the circle such as area and circumference
     */
    public void displayDetails() {
        System.out.println("Area: " + this.area());
        System.out.println("Circumference: " + this.circumference());
    }

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }

    /**
     * Program used to invoke Circle's methods, and display its details
     */
    public static void main(String[] args) {
        Circle circle = new Circle(4.5);

        System.out.println("this.area(): " + circle.area());
        System.out.println("this.circumference(): " + circle.circumference());
        System.out.println("\nDisplaying details with this.displayDetails():");
        circle.displayDetails();
    }
}
