package co.m_salah.hacker_rank.Challenges.InterviewPreparation.WarmUpChallenges;

import java.util.Scanner;

public class JumpingOnTheClouds {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println("result = "+result);
        scanner.close();
    }

    private static int jumpingOnClouds(int[] c) {
        int jumps = 0;
        int i=0;
        while (i != c.length -1){
            if (c[i+1] == 0){
                if (i+2 < c.length){
                    if ( c[i+2] == 0){
                        i+=2;
                        jumps++;
                    }else {
                        i+=1;
                        jumps++;
                    }
                }else {
                    i+=1;
                    jumps++;
                }
            }else if (c[i+1] == 1){
                if (i+2 < c.length){
                    i+=2;
                    jumps++;
                }
            }
        }
        return jumps;
    }

}
