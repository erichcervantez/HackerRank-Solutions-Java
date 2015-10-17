package main.java.com.hackerrank.algorithms.strings;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/alternating-characters
 */
public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine();
        String[] testCases = new String[T];
        for (int i = 0; i < T; i++)
        {
            testCases[i] = scanner.nextLine();
        }

        for (int i = 0; i < testCases.length; i++)
        {
            ArrayList<String> arrayList = new ArrayList<>();
            char[] chars = testCases[i].toCharArray();
            for (int x = 0; x < chars.length; x++)
            {
                arrayList.add(String.valueOf(chars[x]));
            }

            int counter = 0;
            for (int y = 0; y < arrayList.size(); y++)
            {
                if ((y + 1) < arrayList.size())
                {
                    if (arrayList.get(y).equals(arrayList.get(y + 1)))
                    {
                        counter++;
                    }
                }
            }

            System.out.println(counter);
        }
    }
}
