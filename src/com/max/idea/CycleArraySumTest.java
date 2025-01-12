package com.max.idea;

import java.util.Scanner;

/*
 * Пример работы с циклами. Задача № 9
 * Булгаков В.В.
 * 12.01.2025 г
 */
public class CycleArraySumTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        int i =0;
        double sum = 0;
        //1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.
        arrSize = GetInputValue("Введите размер массива для обработки:", scanner);

        if (arrSize <= 0)  {
            System.out.println("Некорректный размер массива");
            return;
        }
        double [] arrCalc = new double [arrSize];
        while (i < arrCalc.length) {

            System.out.print("Ведите "+i+" элемент массива:");
            if (scanner.hasNextDouble()) {
            arrCalc[i] = scanner.nextDouble();
            sum += arrCalc[i];}
            else {
                System.out.println("Некорректный ввод (неверный разделитель)");
                return;
            }
            i++;
        }
        //2. Посчитайте среднее арифметическое элементов массива.
        double midAr = sum / arrCalc.length;
        //3. После этого произведите вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (i = 0; i < arrCalc.length; i++) {
            System.out.println("Элемент "+ i +": "+ arrCalc[i]+" * "+ midAr +" = "+(arrCalc[i]*midAr) );
        }

    }
    public static int GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        int liRes;
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            liRes = scanner.nextInt();
        }
        else
        {liRes = -1;}
        return liRes;
    }
}
