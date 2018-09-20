package hackerrank;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-if-else/problem
 */


/**
 *
 * @author frank.tran
 */
public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(N%2!=0) {
            System.out.println("Weird");
        } else {
            if(N <= 5 && N >= 2) {
                System.out.println("Not Weird");
            } else {
                if(N <= 20 && N >= 6) {
                    System.out.println("Weird");
                } else {
                    System.out.println("Not Weird");
                }
            }
        }
        scanner.close();
    }
    
}
