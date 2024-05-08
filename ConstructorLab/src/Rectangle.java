public class Rectangle {
    private double width;
    private double height;

    Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    Rectangle(double value) {
        this.width = value;
        this.height = value;
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return this.width * this.height;
    }

//    public static void main(String[] args) {
//        Rectangle rec = new Rectangle(3,5);
//
//        System.out.println(rec.area());
//    }
}
