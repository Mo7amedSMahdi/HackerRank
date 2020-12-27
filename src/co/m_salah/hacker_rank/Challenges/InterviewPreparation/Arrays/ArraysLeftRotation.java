package co.m_salah.hacker_rank.Challenges.InterviewPreparation.Arrays;

import java.util.Scanner;

public class ArraysLeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);

        System.out.println();
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(" ");
            }
        }
        scanner.close();
    }

    private static int[] rotLeft(int[] a, int d) {
        int size = a.length;
        int shiftedUnites = size-d;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            if (i+shiftedUnites < size){
                arr[i+shiftedUnites] = a[i];
            }else if (i + shiftedUnites >= size){
                int j = shiftedUnites - (size - i);
                arr[j] = a[i];
            }
        }
        return arr;
    }
}
