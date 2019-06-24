package season2;

import season1.CheckPrime;

public class DeleteElementOftArray {
    public static int[] deleteElementOfArray(int[] arr, int number){
        int[] arr1 = new int[arr.length - 1];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == number){
                index = i;
                break;
            }
        }
        for(int i = 0; i < arr1.length; i++){
            if(i < index){
                arr1[i] = arr[i];
            } else {
                arr1[i] = arr[i + 1];
            }
        }
//        for(int i = index; i < arr.length - 1; i++){
//                arr[i] = arr[i + 1];
//        }
//
//        arr[arr.length - 1] = 0;
//        return arr;

        return arr1;
    }

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang");
        int length = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang");
        int[] arr = InsertArray.importArrayOneWay(length);
        System.out.println("Nhap phan tu muon xoa ");
        int number = CheckPrime.scanner.nextInt();
        arr = deleteElementOfArray(arr,number);
        for (int x : arr) {
            System.out.println(x + " ");
        }
    }
}
