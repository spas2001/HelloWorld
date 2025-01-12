package com.max.idea;

import java.util.Scanner;

/*
 * Пример работы с циклами. Задача № 8
 * Булгаков В.В.
 * 12.01.2025 г
 */
public class CycleSumTest {
    public static void main(String[] args) {
        //Напишите программу, где пользователь вводит любое целое положительное число n. А программа суммирует все нечетные числа от 1 до введенного пользователем числа n.
        Scanner scanner = new Scanner(System.in);
        long endValue = GetInputValue("Введите число: ", scanner);
        long i = 0;
        long sum = 0;
        String lsResult="";
        //Проверяем, что число положительное
        if (endValue < 1) {
            System.out.println("Данное значение должно быть положительным");
            return;
        }
        //Суммируем все нечетные числа
        while (i <= endValue) {
            if (!(i % 2 == 0)) {
              sum += i;
              if (lsResult.isEmpty()) {
                  lsResult += i;
              }
              else {

                  lsResult += " + " + i;
              }

            }
            i++;
        }
        System.out.println(lsResult+" = "+sum);
    }

    public static long GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
        return scanner.nextLong();
    }
}
