package co.m_salah.hacker_rank.Challenges.InterviewPreparation.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        IntStream.range(0, q).forEach(i -> {
            try {
                queries.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.dynamicArray(n, queries);


        bufferedReader.close();
    }
}

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        // Write your code here
        List<List<Integer>> seqList = new ArrayList<>();
        int lastAns =0;
        List<Integer> result = new ArrayList();

        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        for (List<Integer> seq : queries){
            int index = (seq.get(1) ^ lastAns ) % n;

            int y = seq.get(2);
            switch (seq.get(0)){
                case 1:
                    seqList.get(index).add(y);
                    break;
                case 2:
                    int size = seqList.get(index).size();
                    lastAns = seqList.get(index).get(y % size);
                    result.add(lastAns);
                    break;

            }
        }

        return result;
    }



}

