package co.m_salah.hacker_rank.Challenges.InterviewPreparation.Arrays;

import java.util.Scanner;

public class ArraysDS {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]);

            if (i != res.length - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }

    private static int[] reverseArray(int[] arr) {
        int size = arr.length;
        int[] ra = new int[size];
        int j=0;
        int i=size-1;
        while (i > -1){
            ra[j] = arr[i];
            j++;
            i--;
        }
        return ra;
    }
}
