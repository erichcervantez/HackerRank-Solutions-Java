package main.java.com.hackerrank.algorithms.warmup;

import java.util.*;

public class LibraryFine
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[3];
        int[] e = new int[3];
        for (int i = 0; i < 3; i++)
            a[i] = scanner.nextInt();
        for (int x = 0; x < 3; x++)
            e[x] = scanner.nextInt();
        System.out.println(
                a[2] > e[2] ? 10000 :
                        (a[2] < e[2] ? 0 :
                                (a[1] < e[1] ? 0 :
                                        (a[1] > e[1] ? ((a[1] - e[1]) * 500) :
                                                (a[0] > e[0] ? (a[0] - e[0]) * 15 : 0)))));

    }
}
