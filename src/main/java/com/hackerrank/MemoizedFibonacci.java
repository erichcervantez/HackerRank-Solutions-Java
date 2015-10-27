package main.java.com.hackerrank;

import java.util.*;

public class MemoizedFibonacci
{
    private static HashMap<Integer, Integer> hashMap = new HashMap<>();

    public static void main(String[] args)
    {
        for (int i = 0; i < 50; i++)
        {
            System.out.println(i + " = " + memofib(i));
        }
    }

    private static int fib(int n)
    {
        if (n <= 0)
            return 0;
        if (n == 2)
            return 1;

        return fib(n - 1) + fib(n - 2);
    }

    private static int memofib(int n)
    {
        if (n <= 2)
            return 1;

        int x;
        if (hashMap.containsKey(n))
        {
            x = hashMap.get(n);
        }
        else
        {
            x = memofib(n - 1) + memofib(n - 2);
            hashMap.put(n, x);
        }

        return x;
    }
}
