package main.java.com.hackerrank.java.introduction;

import java.util.*;

public class JavaLoops
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        HashMap<Integer, int[]> hashMap = new HashMap<>();
        for (int i = 0; i < t; i++)
        {
            int[] array = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
            hashMap.put(i, array);
        }

        double n = 0;
        for (int x = 0; x < t; x++)
        {
            int z = 0;
            for (int y = 0; y < hashMap.get(x)[2]; y++)
            {
                n = Math.pow(2, y);
                z += n;
                System.out.print(hashMap.get(x)[0] + z * hashMap.get(x)[1] + " ");
            }
            System.out.println();
        }
    }
}
