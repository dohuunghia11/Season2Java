package season2;

import season1.CheckPrime;

public class DemSoLuongSinhVienPass {
    public static int countStudent(double[] testScore){
        int count = 0;
        for(int i = 0; i < testScore.length; i++){
            if(testScore[i] > 5){
                count++;
            }
        }
        return count;
    }
    public static double[] importTestScore(){
        double[] arr = new double[30];
        for(int i = 0; i < 30; i++){
            arr[i] = CheckPrime.scanner.nextDouble();
        }
        return arr;
    }
    public static void main(String[] args) {
        System.out.println("Enter Test Score : ");
        double[] testScore = importTestScore();
        System.out.println("The number of students passing the exam is : " + countStudent(testScore));
    }
}
