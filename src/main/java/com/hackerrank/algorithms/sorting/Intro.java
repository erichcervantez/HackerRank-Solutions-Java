package main.java.com.hackerrank.algorithms.sorting;

import java.util.*;

public class Intro
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int n = scanner.nextInt();
        int[] ar = new int[n];
        int index = 0;
        for (int i = 0; i < n; i++)
        {
            ar[i] = scanner.nextInt();
            if (ar[i] == V)
            {
                index = i;
            }
        }

        System.out.println(index);
    }
}
