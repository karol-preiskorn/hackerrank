/*
Given an integer, perform the following conditional actions:

If is odd, print Weird
If is even and in the inclusive range of 2 to 5, print Not Weird
If is even and in the inclusive range of 6 to 20, print Weird
If is even and greater than 20, print Not Weird

Complete the stub code provided in your editor to print whether or not is weird.
 */

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class EvenOdd {

    private static final Scanner scanner = new Scanner(System.in);
    @Getter @Setter private static int N;

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    public static void main(String[] args) {
        enterN();
        System.out.println(evenOdd());
    }


    public int str2int(String p_str) {
        int foo;
        try {
            foo = Integer.parseInt(p_str);
        }
        catch (NumberFormatException e)
        {
            foo = 0;
        }
        return foo;
    }

    public EvenOdd(String p_n) {
        // Static members belong to the class, not to a particular instance.
        EvenOdd.setN(str2int(p_n));
    }

    private static void enterN() {
        N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
    }

    public static String evenOdd() {
        if (! isOdd(N)){
            return "Weird";
        } else {
            if(N >= 2 && N <= 5) {
                return "Not Weird";
            } else if (N >= 6 && N <= 20) {
                return "Weird";
            } else if (N > 20) {
                return "Not Weird";
            }
        }
        return null;
    }
}

