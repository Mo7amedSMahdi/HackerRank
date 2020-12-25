package co.m_salah.hacker_rank.Challenges.InterviewPreparation.WarmUpChallenges;

import java.util.Scanner;

public class SalesByMatch {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];
        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        System.out.println("result = "+result);
        scanner.close();
    }

    private static int sockMerchant(int n, int[] ar) {
        int counter =0;
        int result =0;
        for (int i=0;i<n;i++){
            if (ar[i] !=0){
                for (int j=0;j<n;j++){
                    if ( ar[i] == ar[j]){
                        counter ++;
                        if (i !=j){
                            ar[j] =0;
                        }
                    }
                }
                result += counter/2;
                counter = 0;
                ar[i] =0;
            }
        }
        return result;
    }
}
