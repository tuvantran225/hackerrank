/*
 * https://www.hackerrank.com/challenges/java-end-of-file/problem
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author frank.tran
 */
public class JavaEndoffile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while(scan.hasNext()) {
            System.out.printf("%d %s", i++, scan.nextLine());
            System.out.println();
        }
    }
}
