/**
 * hackerrank
 * PACKAGE_NAME
 * karol 2020-02-26
 *
 * You are given an integer n you have to convert it into a string.
 *
 * Please complete the partially completed code in the editor. If your code successfully converts n into a string
 * the code will print "Good job". Otherwise it will print "Wrong answer".
 *
 * n can range between -100 to 100 inclusive.
 **/

import java.util.*;
import java.security.*;
public class JavaIntToString {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below

            //Write your code here

            String s = Integer.toString(n);

            if (n == Integer.parseInt(s) && n >= -100 && n <= 100) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException | InputMismatchException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }
}
