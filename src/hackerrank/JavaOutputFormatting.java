package hackerrank;


import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-output-formatting/problem
 */


/**
 *
 * @author frank.tran
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++) {
            String s = scan.next();
            int d = scan.nextInt();
            System.out.printf("%15s%07d", s, d);
        }
        System.out.println("================================");
    }
    
}
