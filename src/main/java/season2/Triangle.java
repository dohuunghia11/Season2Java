package season2;

import java.util.Scanner;

public class Triangle {
    private double edgeOne;
    private double edgeTwo;
    private double edgeThree;

    public Triangle() {
        edgeOne = edgeTwo = edgeThree = 1.0;
    }

    public Triangle(double edgeOne, double edgeTwo, double edgeThree)
            throws IllegalTriangleException1 {
        if (edgeOne + edgeTwo <= edgeThree ||
                edgeOne + edgeThree <= edgeTwo ||
                edgeTwo + edgeThree <= edgeOne)
            throw new IllegalTriangleException1(edgeOne, edgeTwo, edgeThree);
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeatSidesInput = true;
        do {
            System.out.println("Enter three edge of the triangle: ");
            double edgeOne = input.nextDouble();
            double edgeTwo = input.nextDouble();
            double edgeThree = input.nextDouble();

            try {
                Triangle triangle = new Triangle(edgeOne, edgeTwo, edgeThree);
                repeatSidesInput = false;


            }
            catch (IllegalTriangleException1 ex) {
                System.err.println("Exception!!!!!");
            }

        } while (repeatSidesInput);
    }
}

