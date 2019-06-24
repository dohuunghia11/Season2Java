package season2;

import season1.CheckPrime;

public class FindMinArray {
    public static int findMinArray(int[] arr){
        int min = arr[0];
        for( int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang");
        int length = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang");
        int[] arr = InsertArray.importArrayOneWay(length);
        System.out.println("Phan tu nho nhat trong mang la : " + findMinArray(arr));
    }
}
