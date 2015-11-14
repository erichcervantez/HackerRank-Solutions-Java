package main.java.com.hackerrank.algorithms.implementation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/angry-professor
 */
public class AngryProfessor
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int counter = 0;
            for (int x = 0; x < N; x++)
            {
                int a = scanner.nextInt();
                if (a <= 0)
                    counter++;
            }

            if (counter < K)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
