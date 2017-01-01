package org.vineetnair.hackerrank.tutorials.ctci;

import java.util.Scanner;
import java.util.Stack;

/**
 * Balanced Brackets.
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets?h_r=next-challenge&h_v=zen
 */
public class BalancedBrackets {
    public boolean isBalanced(String exp) {
        if (exp.length() % 2 != 0) {
            return false;
        }

        char[] cExp = exp.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c: cExp) {
            switch (c) {
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    }
                    char sTop = stack.pop();
                    if (sTop != c) {
                        return false;
                    }
                    break;
                default:
                    return false;
            }
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        BalancedBrackets sol = new BalancedBrackets();
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (sol.isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
