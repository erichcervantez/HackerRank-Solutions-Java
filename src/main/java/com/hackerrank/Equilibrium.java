package main.java.hackerrank;

/**
 * Given an array of integers (A), find the index where the
 * preceeding sum of integers equals the remaining sum of
 * integers.
 */
public class Equilibrium
{
    public static void main(String[] args)
    {
        int[] A = {10, 6, 6, -4, -3, -9, -8, 6, 5, -7, -10};

        int equilibrium = 0;
        for (int i = 0; i < A.length; i++)
        {
            int preceedingSum = 0;
            int remainingSum = 0;

            //get sum of integers preceeding index
            for (int a = 0; a < i; a++)
            {
                preceedingSum += A[a];
            }

            //get sum of remaining integers
            for (int b = i; b < A.length; b++)
            {
                remainingSum += A[b];
            }

            if (preceedingSum == remainingSum)
                equilibrium = i;

            System.out.println("i:" + i + ", ps=" + preceedingSum + ", rem=" + remainingSum);
        }


        System.out.println(equilibrium);
    }
}
