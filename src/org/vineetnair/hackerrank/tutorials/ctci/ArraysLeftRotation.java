package org.vineetnair.hackerrank.tutorials.ctci;

import java.util.Scanner;

/**
 * @nairv.
 *
 *
 A left rotation operation on an array of size  shifts each of the array's elements  unit to the left.
 For example, if left rotations are performed on array , then the array would become .

 Given an array of  integers and a number, , perform  left rotations on the array.
 Then print the updated array as a single line of space-separated integers.

 Input Format

 The first line contains two space-separated integers denoting the respective values of  (the number of integers)
 and  (the number of left rotations you must perform).
 The second line contains  space-separated integers describing the respective elements of the array's initial state.

 Constraints

 Output Format

 Print a single line of  space-separated integers denoting the final state of the array after performing
 left rotations.

 Sample Input

 5 4
 1 2 3 4 5
 Sample Output

 5 1 2 3 4

 5 -4-> 1

 4 -4-> 5

 3 -4->
 */
public class ArraysLeftRotation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rotations = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] output = performLeftRotations(arr, rotations);
        for (int i = 0; i < n; i++) {
            System.out.print(output[i]);
            if (i != n-1) {
                System.out.print(" ");
            }
        }
    }

    public static int[] performLeftRotations(int[] inputArr, int rotations) {
        int size = inputArr.length;
        int modRotations = rotations % size;

        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            if ( i - modRotations < 0) {
                output[i - modRotations + size] = inputArr[i];
            } else {
                output[i - modRotations] = inputArr[i];
            }
        }

        return output;
    }
}
