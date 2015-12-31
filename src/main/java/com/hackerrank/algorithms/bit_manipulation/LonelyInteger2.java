package main.java.com.hackerrank.algorithms.bit_manipulation;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/lonely-integer
 * There are N integers in an array A. All but one integer occur in pairs.
 * Your task is to find the number that occurs only once.
 * <p>
 * Difficulty: easy
 */
public class LonelyInteger2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++)
        {
            int digit = scanner.nextInt();
            if (hashSet.add(digit) == false)
            {
                hashSet.remove(digit);
            }
        }

        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
