package com.max.idea;
/* Итоговая задача № 2
 * Булгаков В.В.
 * 13.01.2025 г.
 */
import java.util.Scanner;

public class FinalXTest {
    public static void main(String[] args) {
        /*Напишите программу, которая позволит решить простое уравнение относительно x. Программа принимает на вход строку длиной 5 символов.
          Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
          Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке.
          Нужно найти неизвестное.  */
    Scanner sc = new Scanner(System.in);
    String lsIn = GetInputValue("Введите выражение: ", sc);
    if (lsIn.isEmpty()){
        System.out.println("Некорректный ввод");
        return;
    }
    else {
        System.out.println("Ввод: "+ lsIn);
    }
    //Получаем оператор
    String lsOp = lsIn.substring(1,2);
    int liArg1;
    int liArg2;
    int liArgX = 0;
    //Проверяем где Х
     int liPos = lsIn.indexOf("x");
    //Позиция в конце
     if (liPos == lsIn.length()-1){
       liArg1 = Integer.parseInt(lsIn.substring(0,1));
       liArg2 = Integer.parseInt(lsIn.substring(2,3));
       if (lsOp.equals("+")){
           liArgX = liArg1 + liArg2;
       }
       else if (lsOp.equals("-")){
           liArgX = liArg1 - liArg2;
       }
         System.out.println("Вывод: "+liArgX);
    }
    switch (liPos) {
        case 0:
            liArg1 = Integer.parseInt(lsIn.substring(2,3));
            liArg2 = Integer.parseInt(lsIn.substring(4,5));
            if (lsOp.equals("+")){
                liArgX = liArg2 - liArg1;
            }
            else if (lsOp.equals("-")){
                liArgX = liArg1 + liArg2;
            }
            System.out.println("Вывод: "+liArgX);
            break;
        case 2:
            liArg1 = Integer.parseInt(lsIn.substring(0,1));
            liArg2 = Integer.parseInt(lsIn.substring(4,5));
            if (lsOp.equals("+")){
                liArgX = liArg2 - liArg1;
            }
            else if (lsOp.equals("-")){
                liArgX = liArg1 - liArg2;
            }
            System.out.println("Вывод: "+liArgX);
            break;
    }


                }
    public static String GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
         String lsRes  = scanner.next();

         if ((lsRes.length() != 5) || !(lsRes.substring(1,2).matches("[+-]+")) || !(lsRes.substring(3,4).matches("=")) || !(lsRes.substring(0,1).matches("[0-9x]+"))
                 || !(lsRes.substring(2,3).matches("[0-9x]+")) || !(lsRes.substring(4,5).matches("[0-9x]+")) || !(lsRes.matches("[0-9x+-=]+"))){
             lsRes ="";
           }

         return lsRes;
    }
}
