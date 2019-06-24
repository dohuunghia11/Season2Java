package season2;

import season1.CheckPrime;

public class CountCharInString {
    public static int countChar(String str, char ch ){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Nhap vao mot chuoi ");
        String str = CheckPrime.scanner.nextLine();
        System.out.println("Nhap ky tu ");
        String ch = CheckPrime.scanner.nextLine();
        char[] chars = ch.toCharArray();
        System.out.println("So lan xuat hien ky tu " + ch + " trong mang la : " + countChar(str,chars[0]));
    }
}
