package season2;

import season1.CheckPrime;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {
        System.out.println("Nhap so phan tu cua mang");
        int length = CheckPrime.scanner.nextInt();
        System.out.println("Nhap cac phan tu trong mang");
        int[] arr = InsertArray.importArrayOneWay(length);
        System.out.println("Vui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = CheckPrime.scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }
    }
}
