package com.max.idea;
/**
 * Пример работы с массивами. Задача № 3
 * @author Булгаков В.В.
 * 10.01.2025 г
 */

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        //1. Задайте массив из 5 любых целых чисел
        int[] Arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Исходный массив: " + Arrays.toString(Arr));
        //2. Поменяйте местами первый и последний элемент в массиве
        int arFirst = Arr[0];
        int arLast = Arr[Arr.length - 1];
        Arr[Arr.length - 1] = arFirst;
        Arr[0] =  arLast;
        //Для получения последнего и среднего элементов в массиве используйте свойство length.
        int arMiddle = Arr[Arr.length / 2];
        //3. Вывести в консоль результат суммы первого и среднего элемента
        System.out.println("Результирующий массив: " + Arrays.toString(Arr));
        System.out.println("Первый элемент: " +Arr[0]);
        System.out.println("Последний элемент: " +Arr[Arr.length - 1]);
        System.out.println("Средний элемент: " +arMiddle);
        System.out.println("Результат: "+(Arr[0] + arMiddle));

    }
}
