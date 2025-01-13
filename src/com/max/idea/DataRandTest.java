package com.max.idea;

import java.util.Random;

/*
 * Пример работы с данными. Задача № 14
 * Булгаков В.В.
 * 13.01.2025 г
 */
public class DataRandTest {
    public static void main(String[] args) {
        //Напишите программу, заполняющую массив из 15 элементов рандомными значениями в диапазоне от -20 до 20. Далее:
        int [] arrRand = new int[15];
        int minValue = 20, maxValue = -21;
        Random rand = new Random();
        System.out.println("Массив");
        for (int i = 0; i < arrRand.length; i++) {
            arrRand[i] = rand.nextInt(41) - 20;
            System.out.print(" " +arrRand[i]);
            if (arrRand[i] < minValue) {minValue = arrRand[i];}
            if (arrRand[i] > maxValue) {maxValue = arrRand[i];}
        }
        //1. Выведите максимальный и минимальный элемент массива.
        System.out.println("\nМаксимальный элемент массива: " + maxValue +", минимальный элемент: " + minValue);
        //2. Из максимального и минимального значения выведите наибольшее по модулю.
        System.out.println("Максимальный элемент по модулю: " + Math.max(Math.abs(maxValue),Math.abs(minValue)));
    }
}
