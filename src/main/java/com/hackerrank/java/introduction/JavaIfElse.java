package main.java.com.hackerrank.java.introduction;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-if-else
 * difficulty: easy
 * <p>
 * This problem will test your knowledge on "if-else" statements.
 * <p>
 * Given an integer N as input, check the following:
 * <p>
 * If N is odd, print "Weird".
 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
 * If N is even and N>20, print "Not Weird".
 */
public class JavaIfElse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        //use modulus operator to determine if N is odd
        if (N % 2 != 0)
        {
            //remainder of N/2 is not 0, meaning odd
            System.out.println("Weird");
        }
        else if ((N % 2 == 0) && (N >= 2 && N <= 5))
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        }
        else if ((N % 2 == 0) && (N >= 6 && N <= 20))
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Weird");
        }
        else if ((N % 2 == 0) && N > 20)
        {
            //remainder of N/2 is 0, meaning even
            System.out.println("Not Weird");
        }
    }
}
