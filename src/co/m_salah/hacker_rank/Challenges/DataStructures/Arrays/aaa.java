package co.m_salah.hacker_rank.Challenges.DataStructures.Arrays;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

import co.m_salah.hacker_rank.Challenges.DataStructures.Arrays.A;
public class aaa extends A{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            System.out.println(isBalanced(in.next()));
        }
        in.close();
    }

    static boolean isBalanced(String parentheses) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < parentheses.length(); i++) {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (stack.empty()) {
                return false;
            } else {
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '[' && ch != ']')
                        || (top == '{' && ch != '}')) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
