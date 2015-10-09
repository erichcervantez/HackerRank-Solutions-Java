package main.java.com.hackerrank.algorithms.strings;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse
 */
public class StringReverse
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        StringBuilder stringBuilder = new StringBuilder(A);
        if (A.compareTo(stringBuilder.reverse().toString()) == 0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
