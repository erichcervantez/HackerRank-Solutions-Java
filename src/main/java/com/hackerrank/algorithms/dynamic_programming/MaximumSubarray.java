package main.java.com.hackerrank.algorithms.dynamic_programming;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/maxsubarray
 * <p>
 * Key points:
 * - Don't initialize with zero.  Zero would be used in the comparisons.
 * - This is a modification of Kandane's algorithm
 */
public class MaximumSubarray
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String answer = "";
        for (int i = 0; i < T; i++)
        {
            int N = scanner.nextInt();
            int[] A = new int[N];
            for (int x = 0; x < N; x++)
            {
                A[x] = scanner.nextInt();
            }

            int max_so_far = A[0] < 0 ? A[0] : 0;
            int max_ending_here = 0;
            int non_contig_max_so_far = A[0] < 0 ? A[0] : 0;
            for (int a = 0; a < N; a++)
            {
                max_ending_here = max_ending_here + A[a];
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_so_far < A[a])
                    max_so_far = A[a];
                if (A[a] > 0)
                    non_contig_max_so_far += A[a];
            }

            System.out.println(max_so_far + " " + non_contig_max_so_far);
        }
    }
}
