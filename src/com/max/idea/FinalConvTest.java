package com.max.idea;
/*
 * Итоговая задача № 1
 * Булгаков В.В.
 * 13.01.2025 г.
 */
import java.util.Scanner;


public class FinalConvTest {
    public static void main(String[] args) {
        //Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
       Scanner sc = new Scanner(System.in);
        double ldVar1 = GetInputValue("Введите текущий курс доллара: ", sc);
        if (Double.isNaN(ldVar1)|| ldVar1 <=0) {
            System.out.println("Некорректное значение");
            return;
        }
        double ldVar2 = GetInputValue("Введите количество рублей: ", sc);
        if (Double.isNaN(ldVar2)|| ldVar2 <=0) {
            System.out.println("Некорректное значение");
            return;
        }
        System.out.println("Курс доллара: "+ldVar1);
        System.out.println("Количество рублей: "+ldVar2);
        double ldSum = Math.round(ldVar1 * ldVar2*100);
        ldSum = ldSum/100;
        System.out.println("Итого: "+ldSum +" USD");
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
