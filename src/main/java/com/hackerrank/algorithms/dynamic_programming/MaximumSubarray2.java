package main.java.com.hackerrank.algorithms.dynamic_programming;

import java.util.*;

public class MaximumSubarray2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++)
        {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int x = 0; x < N; x++)
            {
                A[x] = scanner.nextInt();
            }

            int max = Integer.MIN_VALUE;
            int max_non_contig = Integer.MIN_VALUE;
            for (int start = 0; start < A.length; start++)
            {
                int sum = 0;
                for (int end = start; end < A.length; end++)
                {
                    sum += A[end];
                    max = Math.max(max, sum);
                }
                max_non_contig = (max_non_contig == Integer.MIN_VALUE) ? A[start] : Math.max(max_non_contig, max_non_contig + A[start]);
            }

            System.out.println(max + " " + max_non_contig);
        }
    }
}
