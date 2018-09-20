package hackerrank;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-loops-i/problem
 */


/**
 *
 * @author frank.tran
 */
public class JavaLoopsI {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for(int i=1; i<=10; i++) {
            System.out.printf("%d x %d = %d", N, i, N*i);
            System.out.println();
        }
        scanner.close();
    }
    
}
