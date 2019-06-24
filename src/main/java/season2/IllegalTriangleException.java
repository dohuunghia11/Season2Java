package season2;

import season1.CheckPrime;

public class IllegalTriangleException {
    public static boolean illegalTriangleException(double edgeOne, double edgeTwo, double edgeThree){
        if(edgeOne < 0 || edgeTwo < 0 || edgeThree < 0 || (edgeOne + edgeTwo) < edgeThree || (edgeOne + edgeThree) < edgeTwo || (edgeThree + edgeTwo) < edgeOne){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Enter edge one");
        double edgeOne = CheckPrime.scanner.nextDouble();
        System.out.println("Enter edge one");
        double edgeTwo = CheckPrime.scanner.nextDouble();
        System.out.println("Enter edge one");
        double edgeThree = CheckPrime.scanner.nextDouble();
        if(illegalTriangleException(edgeOne, edgeTwo, edgeThree)){
            System.out.println("Three sides of the triangle are valid");
        } else {
            System.err.println("Three sides of the triangle are invalid");
        }
    }
}
