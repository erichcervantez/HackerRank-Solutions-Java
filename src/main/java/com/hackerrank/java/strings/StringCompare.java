package main.java.com.hackerrank.java.strings;

import java.util.*;

public class StringCompare
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Integer k = scanner.nextInt();

        TreeSet<String> treeSet = new TreeSet<>();

        for (int i = 0; i < string.length() - (k - 1); i++)
        {
            treeSet.add(string.substring(i, i + k));
        }

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
    }
}
