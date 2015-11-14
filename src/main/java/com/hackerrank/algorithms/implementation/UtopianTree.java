package main.java.com.hackerrank.algorithms.implementation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/utopian-tree
 */
public class UtopianTree
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = scanner.nextInt();
            int height = 1;
            for (int x = 1; x <= N; x++)
            {
                if (x % 2 == 0)
                    height = height + 1;

                if (x % 2 == 1)
                    height = height * 2;
            }
            System.out.println(height);
        }
    }
}
