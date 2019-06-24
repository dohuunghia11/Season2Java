package season2;

import season1.CheckPrime;

public class TinhTongCacSoOMotCotXacDinh {
    public static int tinhTongColumn(int[][] arr, int column){
        int total = 0;
        if(column < 0 || column > arr.length - 1){
            return total;
        } else {
            for(int i = 0; i < arr.length; i++){
                total += arr[i][column];
            }
        }
       return total;
    }
    public static void main(String[] args) {
        System.out.println("Enter Row");
        int row = CheckPrime.scanner.nextInt();
        System.out.println("Enter Column");
        int column = CheckPrime.scanner.nextInt();
        int[][] arr = new int[row][column];
        demo.importArrayTwoWay(arr);
        System.out.println("Nhap row muon tinh tong");
        int row1 = CheckPrime.scanner.nextInt();
        System.out.println("Tong row " + row1 + " la :" + tinhTongColumn(arr,row1));
    }
}
