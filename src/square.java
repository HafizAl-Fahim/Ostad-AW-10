class square extends Shape {
    double side;

    square(double side) {
        this.side = side;
    }

    @Override
    void draw() {
        System.out.println("Drawing a square.");
    }

    @Override
    double calculateArea() {
        return side * side;
    }
}