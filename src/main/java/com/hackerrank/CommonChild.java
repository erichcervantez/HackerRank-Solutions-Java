package main.java.hackerrank;

import com.sun.javafx.image.*;

import java.util.*;

/**
 * Created by ecervantez on 9/25/2015.
 */
public class CommonChild
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        /*String a = "";
        String b = "";
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int g = 0; g < 1000; g++)
        {
            a += alphabet.charAt(random.nextInt(2));
        }
        for (int g = 0; g < 1000; g++)
        {
            b += alphabet.charAt(random.nextInt(2));
        }
        System.out.println(a + " \n" + b);*/

        String aa = "";
        String bb = "";

        for (char c : a.toCharArray())
        {
            if (b.contains(Character.toString(c)))
            {
                aa += c;
            }
        }

        System.out.println(aa);

        for (char d : b.toCharArray())
        {
            if (a.contains(Character.toString(d)))
            {
                bb += d;
            }
        }


        System.out.println(bb);

        if (aa.equals(bb))
        {
            System.out.println(aa.length());
        }
        else
        {
            String largest = "";
            for (int i = 0; i < aa.length() - 2; i++)
            {
                if (bb.contains(aa.substring(i, aa.length() - 1)))
                {
                    if (aa.substring(i, aa.length() - 1).length() > largest.length())
                    {
                        largest = aa.substring(i, aa.length() - 1);
                    }
                }
            }

            System.out.println(largest.length());
        }
    }
}
