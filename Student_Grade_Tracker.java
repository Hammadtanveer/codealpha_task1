import java.util.Scanner;

public class Student_Grade_Tracker {
    public static void main(String[] args) {
        System.out.println("enter the number of subject");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("enter the marks of subjects");
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextFloat();
        }
        System.out.println("average marks-:"+avg(arr,n));
        System.out.println("highest marks-:"+high(arr,n));
        System.out.println("lowest marks-:"+low(arr,n));
    }
    static float avg(float[]arr,int n ){
        float sum=0;
        for (int i = 0; i < n; i++) {
            sum=sum+arr[i];
        }
        float average=sum/n;
        return average;
    }
  static float high(float[] arr,int n){
        float highest = 0;
      for (int i = 0; i < n; i++) {
          if (highest <arr[i]) {
              highest=arr[i];
          }

      }
      return highest;
  }
    static float low(float[] arr,int n){
        float lowest = 100;
        for (int i = 0; i < n; i++) {
            if (lowest >arr[i]) {
                lowest=arr[i];
            }

        }
        return lowest;
    }

}
