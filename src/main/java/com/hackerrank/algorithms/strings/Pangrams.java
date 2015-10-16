package main.java.com.hackerrank.algorithms.strings;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/pangrams
 * <p>
 * Pangrams are sentences constructed by using every letter of the alphabet at least once.
 */
public class Pangrams
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        TreeSet<String> treeSet = new TreeSet<>();

        for (char c : chars)
        {
            treeSet.add(String.valueOf(c));
        }

        if (treeSet.size() == 27)
        {
            System.out.println("pangram");
        }
        else
        {
            System.out.println("not pangram");
        }
    }
}
