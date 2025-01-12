package com.max.idea;

import java.util.Scanner;

/*
 * Пример работы с циклами. Задача № 7
 * Булгаков В.В.
 * 12.01.2025 г
 */
public class CycleArrayFindTest {
    //Заранее заданные константы
    static String x = "1";
    static String y = "=";
    static String z = "+";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        int i =0;
       //1. Пользователь вводит размер массива и данные с клавиатуры в массив

        arrSize = GetInputValue("Введите размер массива для поиска:", scanner);

        if (arrSize <= 0) {
            System.out.print("Некорректный размер массива");
            return;
        }
        String[] arrFind = new String[arrSize];
//Инициализируем массив
//        for (i = 0; i < arrSize; i++) {
//            arrFind[i] = "";
//         }
//        i = 0;
        while (i < arrFind.length) {

            System.out.print("Ведите "+i+" элемент массива:");
            arrFind[i] = scanner.next();
            i++;
        }
        //2. Сравнить элементы массива с заранее заданными константами x, y, z.
        i = 0;
        while (i < arrFind.length) {
            // 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
            if (arrFind[i].equals(x) || arrFind[i].equals(y) || arrFind[i].equals(z)) {
                System.out.println("Данное значение имеется в константах");
                return;
            }
            i++;
        }
    //Значение не обнаружено
        System.out.print("Данное значение не обнаружено");
    }
    public static int GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
        return scanner.nextInt();
    }


}
