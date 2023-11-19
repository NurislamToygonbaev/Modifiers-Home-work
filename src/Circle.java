public class Circle {
    private final double PI = 4;
    private double radius;

    public double getPI() {
        return PI;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public static void area(){
        Circle circle = new Circle();
        circle.setRadius(4);
        double area = circle.PI * (circle.getRadius() * circle.getRadius());
        System.out.println("area = " + area);
    }

    public static void circumference(){
        Circle circle = new Circle();
        circle.setRadius(3);
        System.out.println("circle.getPI() * 2 * circle.getRadius() = " + circle.getPI() * 2 * circle.getRadius());
    }
}
