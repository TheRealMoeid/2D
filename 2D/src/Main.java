public class Main {
    public static void main(String[] args) {
        try {
            // مثلث قائم‌الزاویه
            Triangle rightTriangle = new RightTriangle(3, 4);
            System.out.println("Right Triangle:");
            System.out.println("Area: " + rightTriangle.getArea());
            System.out.println("Perimeter: " + rightTriangle.getPerimeter());

            // مثلث متساوی‌الساقین
            Triangle isoscelesTriangle = new IsoscelesTriangle(5, 6);
            System.out.println("\nIsosceles Triangle:");
            System.out.println("Area: " + isoscelesTriangle.getArea());
            System.out.println("Perimeter: " + isoscelesTriangle.getPerimeter());

            // مثلث متساوی‌الاضلاع
            Triangle equilateralTriangle = new EquilateralTriangle(4);
            System.out.println("\nEquilateral Triangle:");
            System.out.println("Area: " + equilateralTriangle.getArea());
            System.out.println("Perimeter: " + equilateralTriangle.getPerimeter());

        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}