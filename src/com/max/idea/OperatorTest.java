package com.max.idea;

import java.util.Scanner;

import static java.lang.Math.floor;

public class OperatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] myArray = new double[3] ;
        double varMidArity = 0;
        //1. Ввести три числа с клавиатуры x, y, z
        myArray[0] = GetInputValue("Ведите число х:", scanner);
        myArray[1] = GetInputValue("Ведите число y:", scanner);
        myArray[2] = GetInputValue("Ведите число z:", scanner);
        //2. Найти и вывести в консоль среднее арифметическое этих чисел
        for (int i = 0; i < myArray.length; i++) {
            varMidArity += myArray[i];

        }
        //Вычисляем среднеарифметическое
        varMidArity = varMidArity/myArray.length;
        System.out.println("Среднее арифметическое этих чисел: " + varMidArity);
        //3. Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        varMidArity /=2;
        varMidArity = floor(varMidArity);
        //4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (varMidArity > 3) {
            //System.out.println(varMidArity);
            System.out.println("Программа выполнена корректно.");
        }


    }
     public static double GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры1
        System.out.print(prompt);
         return scanner.nextDouble();
    }

}
