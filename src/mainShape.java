public class mainShape {
    public static void main(String[] args) {
        Shape circle = new circle(5);
        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        Shape square = new square(4);
        square.draw();
        System.out.println("Area of square: " + square.calculateArea());

        Shape triangle = new triangle(3, 6);
        triangle.draw();
        System.out.println("Area of triangle: " + triangle.calculateArea());
    }
}