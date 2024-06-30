class triangle extends Shape {
    double base, height;

    triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void draw() {
        System.out.println("Drawing a triangle.");
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}
