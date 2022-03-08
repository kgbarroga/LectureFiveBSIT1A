public class CircleRunner {
    public static void main(String[] args) {
        /*
        Circle c = new Circle();
        // set up/init value for radius
        double radius = 10;
        // area
        // System.out.println("Area = " + c.computeArea(radius));
        // use mutators
        c.setRadius(radius);
        c.computeArea();
        c.computeCircumference();
        System.out.println("Area = " + c.getArea());
        System.out.println("Circumference = " + c.getCircum());
        */
        double radius = 10;
        Circle2 c2 = new Circle2(radius);
        // c2.setRadius(radius);
        System.out.println("Area = " + c2.computeArea());
        System.out.println("Circumference = " + c2.computeCircumference());
    }
}
