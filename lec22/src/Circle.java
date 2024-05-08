public class Circle implements Shape{
    private double radius;

    Circle() {}

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI * this.radius * 2;
    }

    /* Uncomment to test */
    // public static void main(String[] args) {
    //     Rectangle rectangle = new Rectangle(3,5);
    //     Circle circle = new Circle(4);

    //     System.out.println("Rectangle area: " + rectangle.calculateArea());
    //     System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

    //     System.out.println("Circle area: " + circle.calculateArea());
    //     System.out.println("Circle perimeter: " + circle.calculatePerimeter());
    // }
}
