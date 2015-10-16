package main.java.com.hackerrank.algorithms.sorting;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionSort1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++)
        {
            ar[i] = scanner.nextInt();
        }
        int V = ar[s - 1];

        for (int i = s - 2; i >= 0; i--)
        {
            if (V < ar[i])
            {
                ar[i + 1] = ar[i];
                printNums(ar);
            }
            else if (V > ar[i])
            {
                ar[i + 1] = V;
                printNums(ar);
                break;
            }

            if (i == 0)
            {
                ar[i] = V;
                printNums(ar);
            }
        }
    }

    private static void printNums(int[] ar)
    {
        for (int value : ar)
        {
            System.out.print(value + " ");
        }
        System.out.println("");
    }
}
