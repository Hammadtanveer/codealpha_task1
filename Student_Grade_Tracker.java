import java.util.Scanner;

public class Student_Grade_Tracker {
    public static void main(String[] args) {
        System.out.println("Enter the number of students-:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float[] arr = new float[n+1];
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the Grade of student "+i+"-:");
            arr[i] = in.nextFloat();
        }
        System.out.println("Student Grade Summary:");
        System.out.println("Average Grade -:"+avg(arr,n));
        System.out.println("Highest Grade-:"+high(arr,n));
        System.out.println("Lowest Grade-:"+low(arr,n));
    }
    static float avg(float[]arr,int n ){
        float sum=0;
        for (int i = 1; i <= n; i++) {
            sum=sum+arr[i];
        }
        float average=sum/n;
        return average;
    }
  static float high(float[] arr,int n){
        float highest = 0;
      for (int i = 1; i <=n; i++) {
          if (highest <arr[i]) {
              highest=arr[i];
          }

      }
      return highest;
  }
    static float low(float[] arr,int n){
        float lowest = 100;
        for (int i = 1; i <= n; i++) {
            if (lowest >arr[i]) {
                lowest=arr[i];
            }

        }
        return lowest;
    }

}
