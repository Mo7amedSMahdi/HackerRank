package co.m_salah.hacker_rank.Challenges.InterviewPreparation.WarmUpChallenges;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int steps = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String path = bufferedReader.readLine();

        int result = countingValleys(steps, path);

        System.out.println("result = "+result);
        scanner.close();
    }

    private static int countingValleys(int steps, String path) {
        char[] chrs = path.toCharArray();
        int att = 0;
        int result =0;
        for (char chr : chrs) {
            if (chr == 'D') {
                att--;
            } else if (chr == 'U') {
                if (att < 0) {
                    att++;
                    if (att == 0) {
                        result++;
                    }
                }else {
                    att++;
                }
            }

        }
        return result;
    }
}