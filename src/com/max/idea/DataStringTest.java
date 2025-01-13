package com.max.idea;
/*
 * Пример работы с данными. Задача № 12
 * Булгаков В.В.
 * 13.01.2025 г
 */

import java.util.Scanner;

import static java.lang.Character.toUpperCase;

public class DataStringTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lsStr = GetInputValue("Введите строку (по-умолчанию - I like Java!!!)",sc);
   if (lsStr.isEmpty()) {lsStr = "I like Java!!!";}
        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        if (lsStr.contains("Java")) {
            System.out.println("Строка содержит Java");
        }
        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
       if (lsStr.startsWith("I like")) {
            System.out.println("Строка начинается с \"I like\"");
       }
        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        if (lsStr.endsWith("!!!")) {
            System.out.println("Строка заканчивается на \"!!!\"");
        }
        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.
        if ((lsStr.contains("Java")) && (lsStr.startsWith("I like")) && (lsStr.endsWith("!!!")) ) {
            System.out.println(lsStr.toUpperCase());
        }
        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        lsStr = lsStr.replace("a", "o");
        lsStr = lsStr.substring(lsStr.lastIndexOf("Jovo"),lsStr.lastIndexOf("Jovo") + 4);
        System.out.println(lsStr);

    }

public static String GetInputValue(String prompt, Scanner scanner) {
    //Сделаем отдельную функцию считывания с клавиатуры
    System.out.print(prompt);
    return scanner.nextLine();
}
}
