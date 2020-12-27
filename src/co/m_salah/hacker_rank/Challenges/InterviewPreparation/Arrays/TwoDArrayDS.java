package co.m_salah.hacker_rank.Challenges.InterviewPreparation.Arrays;

import java.util.Scanner;

public class TwoDArrayDS {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println();
        System.out.println("result = "+result);
        scanner.close();
    }

    private static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int columns = arr[0].length;
        int maxHourGlassValue = Integer.MIN_VALUE;

        for (int i = 0; i < rows-2; i++) {
            for (int j = 0; j < columns-2; j++) {
                int currentHourGlassValue = arr[i][j]+arr[i][j+1]+ arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
                maxHourGlassValue = Math.max(maxHourGlassValue,currentHourGlassValue);
            }
        }
        return maxHourGlassValue;
    }


}