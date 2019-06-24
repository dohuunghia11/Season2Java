package season2;

import season1.CheckPrime;

public class TotalRowColumn {
    private static void calculateTotalRow(int[][] arr){
        for(int i = 0;i < arr[0].length; i++){
            int total = 0;
            for( int j = 0; j < arr.length; j++){
                total += arr[i][j];
            }
            System.out.println("Total Row " + i + " = " + total);
        }
    }
    public static void calculateTotalColumn(int[][] arr){
        for(int j = 0;j < arr.length; j++){
            int total = 0;
            for( int i = 0; i < arr[0].length; i++){
                total += arr[i][j];
            }
            System.out.println("Total Column " + j + " la :" + total);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Row");
        int row = CheckPrime.scanner.nextInt();
        System.out.println("Enter Column");
        int column = CheckPrime.scanner.nextInt();
        int[][] arr = new int[row][column];
        demo.importArrayTwoWay(arr);
        calculateTotalRow(arr);
        calculateTotalColumn(arr);
    }
}
