class circle extends Shape {
    double radius;

    circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}