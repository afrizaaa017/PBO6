public class TestShape {
    public static void main(String[] args) {
        // Menguji kelas Shape
        Shape shape1 = new Shape();
        System.out.println(shape1);

        System.out.println("==================================");

        Shape shape2 = new Shape("blue", false);
        System.out.println(shape2);

        System.out.println("==================================");

        // Menguji kelas Circle
        Circle circle = new Circle(4.0);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("==================================");

        // Menguji kelas Rectangle
        Rectangle rectangle = new Rectangle(3.0,4.0);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        
        System.out.println("==================================");

        // Menguji kelas Square
        Square square = new Square(4.0);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        System.out.println("==================================");
    }
}
