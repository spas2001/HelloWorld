package com.max.idea;
/*
 * Пример работы с данными. Задача № 13
 * Булгаков В.В.
 * 13.01.2025 г
 */

import java.util.Scanner;

public class DataStringLatTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lsStr = GetInputValue("Введите строку (по-умолчанию - \"I love java 8 Я люблю java 14 core1\")",sc);
        int sum =0;
   if (lsStr.isEmpty()) {lsStr = "I love java 8 Я люблю java 14 core1";}
        //1. Выведите слова, состоящие только из латиницы. (цифры тоже исключаем, поскольку ТОЛЬКО из латиницы)
        String [] arr = lsStr.split(" ");
        System.out.println("Слова с латиницей");
             for (String s : arr) {
                 if (s.matches("^[a-zA-Z]+$")) {
                System.out.println(s);
                 //2. Выведите количество этих слов.
                     sum++;
                 }
            }
        System.out.println("Количество слов с латиницей: " + sum);
        }
  public static String GetInputValue(String prompt, Scanner scanner) {
    //Сделаем отдельную функцию считывания с клавиатуры
    System.out.print(prompt);
    return scanner.nextLine();
}
}
