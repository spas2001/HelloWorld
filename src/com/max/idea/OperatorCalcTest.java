package com.max.idea;
/*
 * Пример работы с операторами. Задача № 5
 * Булгаков В.В.
 * 10.01.2025 г
 */
import java.util.Scanner;

public class OperatorCalcTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double [] myArray = new double[2] ;
        double varResult = 0;
        char operator;
        //1. Ввести 2 числа с клавиатуры
        myArray[0] = GetInputValue("Ведите первое число:", scanner);
        myArray[1] = GetInputValue("Ведите второе число:", scanner);

        //2. затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        operator = GetInputOperator("введите операцию +, -, /, * :", scanner);

        switch (operator){
            case '+':
                varResult = myArray[0]+myArray[1];
                break;
            case '-':
                varResult = myArray[0]-myArray[1];
                break;
            case '/':
                if (myArray[0]==0){
                    //Деление на 0!
                    System.out.println("Деление на 0 недопустимо!");
                    return;
                }
                varResult = myArray[0]/myArray[1];
                break;
            case '*':
                varResult = myArray[0]*myArray[1];
                break;
            default:
                varResult = Double.NaN;
                break;
        }

        //В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
        if (varResult != Double.NaN) {

            System.out.println("Результат: " + myArray[0] + operator + myArray[1] + " = " + varResult);
        }
        else {
            System.out.println("Неизвестная операция");
        }


    }
     public static double GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
         return scanner.nextDouble();
    }
    public static char GetInputOperator(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания операции с клавиатуры
        System.out.print(prompt);
        return scanner.next().charAt(0);
    }
}
