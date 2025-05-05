public class Main {
    public static void main(String[] args) {
        IPoint center = IPoint.create(0, 0);

        IShape2D circle = new Cyrcle(center, 5);
        System.out.println("Circle Area: " + circle.getArea());

        IShape2D rect = new Rect(center,4, 6);
        System.out.println("Rect Perimeter: " + rect.getPerimeter());

        IShape2D square = new Square(center, 4);
        System.out.println("Square Area: " + square.getArea());

        ILine line = Line.create(IPoint.create(0, 0), IPoint.create(3, 4));
        System.out.println("Line length: " + line.length());

        ITriangle iso = new IsoscelesTriangle(center, 5, 60); // ضلع و زاویه
        System.out.println("Isosceles Base: " + iso.getBase());
        System.out.println("Isosceles Area: " + iso.getArea());

        ITriangle equi = new EquilateralTriangle(center, 6);
        System.out.println("Equilateral Height: " + equi.getHeight());
        System.out.println("Equilateral Area: " + equi.getArea());

        ITriangle right = new RightTriangle(center, 3, 4);
        System.out.println("Right Triangle Perimeter: " + right.getPerimeter());

        System.out.println("Distance from Circle to Square: " + circle.distance(square));

    }
}