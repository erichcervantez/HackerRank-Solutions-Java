package main.java.com.hackerrank.algorithms.strings;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/gem-stones
 */
public class Gemstones
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Set<Character> gemSet0 = new HashSet<>();
        Set<Character> gemSet1 = new HashSet<>();
        for (int i = 0; i < N; i++)
        {
            String s = scanner.next();

            for (int x = 0; x < s.length(); x++)
            {
                if (i == 0)
                    gemSet0.add(s.charAt(x));
                else
                    gemSet1.add(s.charAt(x));
            }

            if (i > 0)
            {
                gemSet0.retainAll(gemSet1);
                gemSet1.clear();
            }
        }

        System.out.println(gemSet0.size());
    }
}
