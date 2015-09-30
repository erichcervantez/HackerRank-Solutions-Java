package main.java.com.hackerrank.algorithms.warmup;

import java.text.*;
import java.util.*;

public class TimeConversion
{
    public static void main(String[] args) throws ParseException
    {
        String input = new Scanner(System.in).next();
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = inputFormat.parse(input);
        System.out.println(outputFormat.format(date));
    }
}
