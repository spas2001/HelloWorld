package com.max.idea;
/*
 * Пример работы с данными. Задача № 11
 * Булгаков В.В.
 * 13.01.2025 г
 */

import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class DataTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lsVar1 ="";
        int liVar2 = 0;
       //1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        double ldVar1 = GetInputValue("Введите первое число: ", scanner);
        if (!Double.isNaN(ldVar1)) {
            lsVar1 = Double.toString(ldVar1);
        }
        else {
            System.out.println("Некорректное число");
            return;
        }
        //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        double ldVar2 = GetInputValue("Введите второе число: ", scanner);
        if (!Double.isNaN(ldVar2)) {
            liVar2 = (int) ldVar2;}
        else {
            System.out.println("Некорректное число");
            return;
        }
        //3. Сравнить 2 числа и вывести большее на экран
        System.out.println("Большее число: " + max(Double.parseDouble(lsVar1) , (double) liVar2) );
        //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        System.out.println("Меньшее число: " + min(Double.parseDouble(lsVar1) , (double) liVar2));

    }
    public static double GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        double ldRes;
        System.out.print(prompt);
        if (scanner.hasNextDouble()) {
            ldRes = scanner.nextDouble();
        }
        else
        {ldRes = Double.NaN;}
        return ldRes;
    }
}
