package main.java.com.hackerrank.java.introduction;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-end-of-file
 */
public class EndOfFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        while (scanner.hasNext())
        {
            System.out.println(counter++ + " " + scanner.nextLine());
        }
    }
}
