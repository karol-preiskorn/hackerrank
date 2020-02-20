/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

/*
https://www.hackerrank.com/challenges/java-loops/problem -task
https://docs.oracle.com/javase/tutorial/essential/exceptions/handling.html - tutorial about exceptions
 */

import java.util.Scanner;

public class javaLoopII {
    private static final Scanner in = new Scanner(System.in);

    public static boolean isBetween(int a, int b, int c) {
        return b > a ? c > a && c < b : c > b && c < a;
    }

    public static void main(String[] args) throws Exception {

        System.out.print("Q ↋ <0 - 500> := ");
        int Q = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (isBetween(0, Q, 500)) {
            throw new  Exception("SHOULD-BE-BEETWEEN-0-AND-500");
        }
        for(int i=0;i<Q;i++){

            System.out.print("a ↋ <0 - 50> := ");
            int a = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (isBetween(0, a, 50)) {
                throw new  Exception("SHOULD-BE-BEETWEEN-0-AND-50");
            }

            System.out.print("b ↋ <0 - 50> := ");
            int b = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (isBetween(0, b, 50)) {
                throw new  Exception("SHOULD-BE-BEETWEEN-0-AND-50");
            }

            System.out.print("n ↋ <0 - 15> := ");
            int n = in.nextInt();
            in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            if (isBetween(0, n, 15)) {
                throw new  Exception("SHULD-BE-BEETWEEN-0-AND-15");
            }

            int sum_n = a;
            int sum_prev = 0;
            for(int j=0;j<n;j++){
                sum_prev = sum_n;
                sum_n = sum_n + (int) (Math.pow(2, j) * b);
                System.out.printf("%d + %d + %.0f * %d = %d \n", sum_prev, a, Math.pow(2, j), b, sum_n);
            }
        }
        in.close();
    }
}
