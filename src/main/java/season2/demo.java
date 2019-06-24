package season2;

import java.util.Scanner;

public class demo {

    public static void importArrayTwoWay(int[][] matrix){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element of Array" );
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextInt();
            }
        }

//        for (int row = 0; row < matrix.length; row++) {
//            for (int column = 0; column < matrix[row].length; column++) {
//                matrix[row][column] = (int) (Math.random() * 100);
//            }
//        }
    }
    public static void main(String[] args) {
        int[][] arr = new int[2][2];
        importArrayTwoWay(arr);
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.println(arr[row][column] + " ");
            }
        }
    }

}