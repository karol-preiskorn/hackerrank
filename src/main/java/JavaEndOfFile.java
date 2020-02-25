/*
 * Copyright (c) 2020. ultimasolution.pl
 */

/**
 * hackerrank
 * PACKAGE_NAME
 * karol 2/21/2020
 * Read some unknown lines of input from stdin(System.in) until you reach EOF; each line of
 * input contains a non-empty String.
 * <p>
 * https://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples
 **/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;

public class JavaEndOfFile {
    public static void solutionTwo(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<String> i = new ArrayList<String>();
        String s = "";
        int l = 1;
        Scanner scan = new Scanner(in);
        while (scan.hasNext("end")) {
            s = scan.nextLine();
            i.add(s);
        }
        System.out.println(i);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int no_line = 1;
        Scanner scan = new Scanner(in);
        while (scan.hasNext()) {
            System.out.println(no_line++ + " " + scan.nextLine());
        }
    }
}




