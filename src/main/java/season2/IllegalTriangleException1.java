package season2;

public class IllegalTriangleException1 extends Exception {
    private double edgeOne;
    private double edgeTwo;
    private double edgeThree;

    public IllegalTriangleException1(double edgeOne, double edgeTwo, double edgeThree) {
        super("Illegal sides " + edgeOne + " " + edgeTwo + " " + edgeThree);
        this.edgeOne = edgeOne;
        this.edgeTwo = edgeTwo;
        this.edgeThree = edgeThree;
    }

    public double getSide1() {
        return edgeOne;
    }

    public double getSide2() {
        return edgeTwo;
    }

    public double getSide3() { return edgeThree; }
}