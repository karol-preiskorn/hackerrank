/*
 * Copyright (c) 2020 luty
 */
/**
 * projekt:  hackerrank
 * pakckage: PACKAGE_NAME
 * autor:    karol
 * data:     2/3/2020
 * <p>
 * description:
 **/

import java.util.Scanner;

public class JavaDataType {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                checkDataType(x);
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    public static void checkDataType(long inputLong) {
        String ret = "";
        if (inputLong >= -128 && inputLong <= 127) System.out.println("* byte");
        if (inputLong >= -Math.pow(2, 15) && inputLong <= (Math.pow(2, 15) - 1)) System.out.println("* short");
        if (inputLong >= -Math.pow(2, 31)  && inputLong <= (Math.pow(2, 31) - 1)) System.out.println("* int");
        if (inputLong >= -Math.pow(2, 63)  && inputLong <= (Math.pow(2, 63) - 1)) System.out.println("* long");
    }
}
