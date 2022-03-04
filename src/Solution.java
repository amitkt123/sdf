import java.util.Scanner;
public class Solution {
    public static int maxSubarray(int A, int B, int[] C) {
        int max_sum= 0;
        int PS[] =  new int[A];
        PS[0] = C[0];
        for(int i=1; i<C.length; i++)
        {
            PS[i]= PS[i-1]+C[i];
        }
        for (int i = 0; i <= C.length; i++) {
            int sum = 0;
            for (int j = i; j < C.length; j++) {
                if(j==0)
                {
                    sum= sum+PS[j];
                }
                else
                sum = sum + PS[j]-PS[j-1];
                System.out.println(sum);
                if(max_sum<sum && sum<=B){
                    max_sum= sum;

                }

            }
            System.out.println();
            //System.out.println(sum);

        }
        return max_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size  = sc.nextInt();
        int b = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
       // int b= sc.nextInt();
        int x = maxSubarray(size,b, arr);
        System.out.println(x);
    }

}
