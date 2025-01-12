package com.max.idea;
/*
 * Пример работы с циклами. Задача № 10
 * Булгаков В.В.
 * 12.01.2025 г
 */

import java.util.Scanner;

public class CycleMatrixTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int arrSizeX;
            int arrSizeY;
            int i =0;
            int j =0;
            int liCol = 0;
            int liStr = 0 ;
            //1. Пользователь вводит размерность массива
            System.out.println("Введите размер массива для обработки");
            arrSizeX = GetInputValue("Введите размер массива 1 :", scanner);
            if (arrSizeX <= 0)  {
                System.out.println("Некорректный размер массива");
                return;
            }
            arrSizeY = GetInputValue("Введите размер массива 2 :", scanner);
            if (arrSizeY <= 0)  {
                System.out.println("Некорректный размер массива");
                return;
            }
            //Задаем массив
            double [][] arrCalc = new double [arrSizeX][arrSizeY];
            //начинаем заполнение
            for (j = 0; j < arrSizeY; j++) {
                liStr = j + 1;
                for (i = 0; i < arrSizeX; i++) {
                    liCol = i+1;
                    System.out.print("Ведите ["+liStr+","+liCol+"] элемент массива:");
                    if (scanner.hasNextDouble()) {
                        arrCalc[i][j] = scanner.nextDouble();
                        }
                    else {
                        System.out.println("Некорректный ввод (неверный разделитель)");
                        return;
                    }
                }
            }
            //произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3
            System.out.println("Исходная 1-я строка матрицы");
            j = 0;
            for (i = 0; i < arrSizeX; i++) {
                System.out.print(" ["+arrCalc[i][j]+"] ");
               }
            System.out.println("\n" + "1-я строка матрицы умноженная на 3");
            for (i = 0; i < arrSizeX; i++) {
                System.out.print(" ["+(arrCalc[i][j]*3)+"] ");
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
