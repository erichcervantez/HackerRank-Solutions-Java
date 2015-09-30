package main.java.com.hackerrank.algorithms.warmup;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/staircase
 */
public class Staircase
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 0; i < N; i++)
        {
            for (int x = 0; x < N - 1 - i; x++)
            {
                System.out.print(" ");
            }

            for (int y = 0; y < 1 + i; y++)
            {
                System.out.print("#");
            }

            System.out.println();
        }
    }
}
