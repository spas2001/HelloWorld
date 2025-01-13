package com.max.idea;

import java.util.Scanner;

/* Итоговая задача № 3
 * Булгаков В.В.
 * 13.01.2025 г.
 */
public class FinalStringTest {
    public static void main(String[] args) {
        //Напишите программу, где пользователь вводит сначала количество строк n,
        // затем сами строки. Среди данных строк найти строку с максимальным количеством различных символов.
        // Если таких строк будет много, то вывести первую.
        Scanner sc = new Scanner(System.in);
        int liStr;
        //Ввод количества строк
        int n = GetInputValueInt("Введите количество строк: ", sc);
        if (n < 1){
            System.out.println("Некорректное значение");
            return;
        }
        String [] arrStr = new String[n];
        long [] arrLen = new long[n];
        long [] arrUniq = new long[n];
        int liPos = 0;
        long llMax = 0;

        for (int i = 0; i < n; i++){
            liStr = i+1;
            //Записываем значение
            arrStr[i] = GetInputValue("Введите строку "+liStr + ": ", sc);
            //Записываем длину строки
            arrLen[i] = arrStr[i].length();
            //Записываем количество уникальных знаков
            arrUniq[i] = GetUniqColl(arrStr[i]);
            if (arrUniq[i] > llMax){
                llMax = arrUniq[i];
                liPos = i;
            }
        }
        System.out.println("Количество строк: "+n);
        for (int i = 0; i < n; i++){
            liStr = i+1;
            System.out.println("Строка "+liStr+": "+arrStr[i]+" Длина строки: "+arrLen[i]+" Количество уникальных символов: "+arrUniq[i]);
        }
        System.out.println("Ответ: " + arrStr[liPos]);

    }

    public static String GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
        return scanner.next();
    }
    public static int GetInputValueInt(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        }
        return 0;
    }
    public static long GetUniqColl (String inStr){
        //Функция подсчитывает уникальное количество знаков в строке
        StringBuilder lsUniq = new StringBuilder();
        for (int i = 0; i < inStr.length(); i++){
            if (lsUniq.toString().indexOf(inStr.charAt(i)) == -1){
                lsUniq.append(inStr.charAt(i));
            }
        }
        return lsUniq.length();
    }

}
