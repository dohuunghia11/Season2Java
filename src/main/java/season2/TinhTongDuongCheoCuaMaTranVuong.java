package season2;

import season1.CheckPrime;

public class TinhTongDuongCheoCuaMaTranVuong {
    public static int tinhTongDuongCheo(int[][] arr){
        int total1 = 0, total2 = 0;
        for (int i = 0; i < arr[0].length; i++){
            total1 += arr[i][i];
        }
        for (int i = arr.length - 1; i >= 0; i--){
            total2 += arr[i][i];
        }
        return total1 + total2;
    }
    public static void main(String[] args) {
        System.out.println("Enter Row");
        int row = CheckPrime.scanner.nextInt();
        System.out.println("Enter Column");
        int column = CheckPrime.scanner.nextInt();
        int[][] arr = new int[row][column];
        demo.importArrayTwoWay(arr);
        System.out.println("Tong 2 duong cheo trong ma tran la : " + tinhTongDuongCheo(arr));
    }
}
