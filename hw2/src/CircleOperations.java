// Problem 2

/**
 * Represents a Circle
 * @author Canhui Huang
 */
class Circle {
    private double radius;

    /**
     * Constructs a new Circle.
     * @param radius the radius of the circle.
     */
    Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Computes & returns the area of the circle
     * @return the area of the circle
     */
    double area() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Computes & returns the circumference of the circle
     * @return the circumference of the circle
     */
    double circumference() {
        return 2 * Math.PI * this.radius;
    }

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }

    public static void main(String[] args) {
        // Instantiate circle object with radius = 5, and then display its area and circumference
        Circle circle = new Circle(5);

        System.out.println("Area = " + circle.area());
        System.out.println("Circumference = " + circle.circumference());
    }
}