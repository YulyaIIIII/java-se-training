/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figures;

/**
 *
 * @author Andrew
 */
public class Figures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 12);
        Rectangle rectangle2 = new Rectangle(8, 14);

        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(8);
        Circle circle3 = new Circle(10);

        Triangle triangle1 = new Triangle(4, 6, 8, 7);
        Triangle triangle2 = new Triangle(5, 10, 15, 12);

        System.out.println("The perimeter of the rectangle1 is: " + rectangle1.info() + " cm." + "\n" + "The area of the rectangle1 is: " + rectangle1.area() + " cm².");
        System.out.println("The perimeter of the rectangle2 is: " + rectangle2.info() + " cm." + "\n" + "The area of the rectangle2 is: " + rectangle2.area() + " cm²." + "\n");
        System.out.println("The radius of the circle1 is: " + circle1.info() + " px." + "The area of the circle1 is: " + circle1.area() + " cm².");
        System.out.println("The radius of the circle2 is: " + circle2.info() + " px." + "The area of the circle2 is: " + circle2.area() + " cm².");
        System.out.println("The radius of the circle3 is: " + circle3.info() + " px." + "The area of the circle3 is: " + circle3.area() + " cm²." + "\n");
        System.out.println("The perimeter of the triangle1 is: " + triangle1.info() + " cm." + "\n" + "The area of the triangle1 is: " + triangle1.area() + " cm².");
        System.out.println("The perimeter of the triangle2 is: " + triangle2.info() + " cm." + "\n" + "The area of the triangle2 is: " + triangle2.area() + " cm².");
    }

    private static class Rectangle {

        private final int width;
        private final int height;

        private Rectangle(int width, int height) {
            this.width = width;
            this.height = height;
        }

        public int info() {
            int perimetr = 2 * (width + height);
            return perimetr;
        }
         public double area() {

            double rctnglarea = width * height;
            return rctnglarea;

        }

    }

    private static class Circle {

        private final int radius;

        private Circle(int radius) {
            this.radius = radius;
        }

        public int info() {
            int size = radius;
            return radius;
        }
        public double area() {

            double crklarea = (Math.PI * (Math.pow(radius, 2)));
            return crklarea;

        }
    }

    private static class Triangle {

        private final int side1;
        private final int side2;
        private final int side3;
        private final int hight;

        private Triangle(int side1, int side2, int side3, int hight) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.hight = hight;
        }

        public int info() {
            int perimetr = side1 + side2 + side3;
            return perimetr;
           
        }

        public double area() {

            double trnglarea = (side3 * hight) / 2;
            return trnglarea;

        }

    }
}
