package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int x = Integer.parseInt(sYear);

        if (x % 400 == 0)
            System.out.println("количество дней в году: 366");
        else if (x % 100 == 0)
            System.out.println("количество дней в году: 365");
        else if (x % 4 == 0)
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");
    }
}