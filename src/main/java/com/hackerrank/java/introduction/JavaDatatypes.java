package main.java.com.hackerrank.java.introduction;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/java-datatypes
 */
public class JavaDatatypes
{
    public static void main(String[] argh)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            try
            {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -(Math.pow(2, 8) / 2) && x <= (Math.pow(2, 8) / 2) - 1) System.out.println("* byte");
                if (x >= -(Math.pow(2, 16) / 2) && x <= (Math.pow(2, 16) / 2) - 1) System.out.println(("* short"));
                if (x >= -(Math.pow(2, 32) / 2) && x <= (Math.pow(2, 32) / 2) - 1) System.out.println(("* int"));
                if (x >= -(Math.pow(2, 64) / 2) && x <= (Math.pow(2, 64) / 2) - 1) System.out.println(("* long"));
            } catch (Exception e)
            {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }
}
