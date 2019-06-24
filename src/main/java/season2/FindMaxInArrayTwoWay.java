package season2;

import season1.CheckPrime;

public class FindMaxInArrayTwoWay {
    public static int findMaxInArrayTwoWay(int[][] arr){
        int max = 0;
        for(int i = 0; i < arr[0].length; i++ ){
            for(int j = 0; j < arr.length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Enter Row");
        int row = CheckPrime.scanner.nextInt();
        System.out.println("Enter Column");
        int column = CheckPrime.scanner.nextInt();
        int[][] arr = new int[row][column];
        demo.importArrayTwoWay(arr);
        System.out.println("Max : " + findMaxInArrayTwoWay(arr));
    }
}
