/*
 * Copyright (c) 2020. ultimasolution.pl
 *
 * hackerrank
 * PACKAGE_NAME
 * karol 2020-02-25
 *
 * Static initialization blocks are executed when the class is loaded, and you can initialize static variables
 * in those blocks. It's time to test your knowledge of Static initialization blocks. You can read about it
 * here https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html.
 * You are given a class Solution with a main method. Complete the given code so that it outputs the area of a
 * parallelogram with breadth and height.
 *
 * You should read the variables from the standard input.
 *
 * If B <= 0 or H <= 0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.
 *
 *
 **/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class JavaStaticInitializerBlock {
    // Write your code here
    static boolean flag;
    static int B,H;

    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        scan.nextLine();
        H = scan.nextInt();
        scan.close();
        if(B>0 && H>0){
            flag = true;
        } else if(B <= 0 && H >= 0 || B >= 0){
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end o
}
