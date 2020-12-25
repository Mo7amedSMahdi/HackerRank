package co.m_salah.hacker_rank.Challenges.InterviewPreparation.WarmUpChallenges;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedString {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println();
        System.out.println("result = "+result);
        scanner.close();
    }

    private static long repeatedString(String s, long n) {
        long size = s.length(), repeated = n/size;
        long left = n - (size * repeated);
        int extra = 0;

        int count = 0;
        for(int i = 0; i < size; i++){
            if(s.charAt(i) == 'a'){
                ++count;
            }
        }

        for(int i = 0; i < left; i++){
            if(s.charAt(i) == 'a'){
                ++extra;
            }
        }

        repeated = (repeated * count) + extra;

        return repeated;

    }

}
