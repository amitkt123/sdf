import java.util.Scanner;
public class leastaveragesubarr {
    public static int solve(int[] A, int B) {
        int min_sum= Integer.MAX_VALUE;

        for (int i = 0; i <= A.length-B; i++) {
            int sum = 0;
            for (int j = i; j < i + B; j++) {
                sum = sum + A[j];
                //System.out.println(sum);

            }
           // System.out.println(sum);
            if(min_sum>sum && sum<B){
                min_sum= sum;

            }
        }
        return min_sum ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size  = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        int b= sc.nextInt();
        int x = solve(arr, b);
        System.out.println(x);
    }

}

