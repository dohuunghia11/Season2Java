package season2;

import season1.CheckPrime;

public class InsertArray {
    public static int[] insertArray(int number, int[] arr, int index){
        int[] arr1 = new int[arr.length + 1];
        if(index == 0){
            arr1[0] = number;
            for(int i = 1; i < arr1.length; i++){
                arr1[i] = arr[i - 1];
            }
        } else if(index == arr.length - 1){
            arr1[arr1.length - 1] = number;
            for (int i = 0; i < arr.length; i++){
                arr1[i] = arr[i];
            }
        } else {
            for (int i = 0; i < arr1.length; i++){
                if(i == index){
                    arr1[i] = number;
                } else {
                    if(i < index){
                        arr1[i] = arr[i];
                    } else {
                        arr1[i] = arr[i - 1];
                    }
                }
            }

        }
        return arr1;
    }
    public static int[] importArrayOneWay(int number){
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++){
            arr[i] = CheckPrime.scanner.nextInt();
        }
        return arr;
    }

    public static void displayArray(int[] arr){
        for (int x: arr) {
            System.out.println(x + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang");
        int length = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang");
        int[] arr = importArrayOneWay(length);

        System.out.println("Nhap so muon chen vao mang");
        int number = CheckPrime.scanner.nextInt();

        System.out.println("Nhap vi tri muon chen vao mang");
        int index = CheckPrime.scanner.nextInt();

        int[] arr1 = insertArray(number,arr,index);
        displayArray(arr1);
    }
}
