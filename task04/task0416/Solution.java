package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = reader.readLine();
        double nTime = Double.parseDouble(sTime);

        if (nTime % 5 >= 0 && nTime % 5 < 3)
            System.out.println("зелёный");
        else if (nTime % 5 >= 3 && nTime % 5 < 4)
            System.out.println("жёлтый");
        else
            System.out.println("красный");
    }
}