package co.m_salah.hacker_rank.Challenges.InterviewPreparation.Arrays;

import java.util.Scanner;

public class MinimumSwaps2 {
/*
    7 1 3 2 4 5 6
    swap(0,1)
    1 7 3 2 4 5 6 s=1
    swap(1,3)
    1 2 3 7 4 5 6 s=2
    swap(3,4)
    1 2 3 4 7 5 6 s=3
    swap(4,5)
    1 2 3 4 5 7 6 s=4
    swap(5,6)
    1 2 3 4 5 6 7 s=5

       ex 2
    1 3 5 2 4 6 7
    swap(1,3)
    1 2 5 3 4 6 7 s=1
    swap(2,3)
    1 2 3 5 4 6 7 s=2
    swap(3,4)
    1 2 3 4 5 6 7 s=3

    2 3 4 1 5
    swap(0,3)
    1 3 4 2 5 s=1
    swap(1,3)
    1 2 4 3 5 s=2
    swap(2,3)
    1 2 3 4 5 s=3


 */

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

        int res = minimumSwaps(arr);
        System.out.println(res);

        scanner.close();
    }

    private static int minimumSwaps(int[] arr) {
        int minIndex = 0;
        int min = arr[0];
        int swaps =0;
        for (int i = 1; i < arr.length ; i++) {
            if (min > arr[i]){
                minIndex = i;
                min = arr[i];
            }
        }
        if (minIndex !=0){
            int temp = arr[0];
            arr[0] = arr[minIndex];
            arr[minIndex] = temp;
            swaps ++;
        }
        for (int i = 1; i < arr.length-1; i++) {
            int pos = arr[i] - arr[0];
            while (arr[i] != arr[pos]){
                int temp = arr[pos];
                arr[pos] = arr[i];
                arr[i] = temp;
                swaps++;
                pos = arr[i] - arr[0];
            }
        }

        return swaps;
    }
}
