package com.max.idea;
/*
 * Пример работы с операторами. Задача № 6
 * Булгаков В.В.
 * 10.01.2025 г
 */
import java.util.Scanner;

public class OperatorConvertTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrMassName = {"kg", "lb","q", "oz"};
        String[] arrMassNameRus = {"Килограммы", "Фунты","Центнеры", "Унции"};
        String[] arrLenName = {"m", "ml","yd", "ft"};
        String[] arrLenNameRus = {"Метры", "Мили","Ярды", "Футы"};
        String nameParamMass;
        String nameParamMassRus;
        String nameParamLen;
        String nameParamLenRus;
        double paramMassLength;
        double [] myArrayCoeffMass = new double[4];
        double [] myArrayCoeffLength = new double[4];
        int varOption = 0;
        int varChoose = 0;
        //1. Пользователю предлагается на выбор ввести массу или расстояние.
        varOption = GetInputValue("Выберите что переводить: 1 - масса, 2 - расстояние:", scanner);
        //2. Пользователю предлагается выбрать единицу измерения.
        switch (varOption) {
            case 1:
                varChoose = GetInputValue("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - центнер, 4 - унция:", scanner);
                nameParamMass = arrMassName[varChoose-1];
                nameParamMassRus = arrMassNameRus[varChoose-1];
                myArrayCoeffMass = GetCoeffConvertMass(nameParamMass);
                //3. Пользователю предлагается ввести количество выбранных единиц:
                paramMassLength = GetInputDouble("Введите вес в выбранных единицах (" +nameParamMassRus+"):", scanner);
                System.out.print(paramMassLength);
                if (myArrayCoeffMass != null) {
                    for (int i = 0; i < myArrayCoeffMass.length; i++) {

                        System.out.println(arrMassNameRus[i] + ":" + (myArrayCoeffMass[i] * paramMassLength) + " "+ arrMassName[i] );
                    }
                }
                break;
            case 2:
                varChoose = GetInputValue("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут:", scanner);
                nameParamLen = arrLenName[varChoose-1];
                nameParamLenRus = arrLenNameRus[varChoose-1];
                myArrayCoeffLength = GetCoeffConvertLen(nameParamLen);
                //3. Пользователю предлагается ввести количество выбранных единиц:
                paramMassLength = GetInputDouble("Введите расстояние в выбранных единицах ("+nameParamLenRus+") :", scanner);
                if (myArrayCoeffLength != null) {
                    for (int i = 0; i < myArrayCoeffLength.length; i++) {
                        System.out.println(arrLenNameRus[i] + ":" + (myArrayCoeffLength[i] * paramMassLength) + " "+ arrLenName[i] );
                    }
                }
                break;
        }


    }
     public static int GetInputValue(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры
        System.out.print(prompt);
         return scanner.nextInt();
    }
    public static double GetInputDouble(String prompt, Scanner scanner) {
        //Сделаем отдельную функцию считывания с клавиатуры веса или расстояния
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static double[] GetCoeffConvertMass(String param ) {
        //String[] arrMassNameRus = {"Килограммы", "Фунты","Центнеры", "Унции"};
    switch (param) {
        case "kg":
            return new double[]{1, 2.2046226, 0.01, 35.273962};
        case "lb":
            return new double[]{0.4535923744953, 1, 0.004535923744953, 16.000000181437};
        case "q":
            return new double[]{100, 220.46226, 1, 3527.3962};
        case "oz":
            return new double[]{0.028349523084478, 0.062499999291262, 0.00028349523084478, 1};
    }
    return null;
}
    public static double[] GetCoeffConvertLen(String param ) {
        // String[] arrLenNameRus = {"Метры", "Мили","Ярды", "Футы"};
        switch (param) {
            case "m":
                return new double[]{1, 0.00062137119223733, 1.0936132983377, 3.2808398950131};
            case "ml":
                return new double[]{1609.344, 1, 1760, 5280};
            case "yd":
                return new double[]{0.9144, 0.00056818181818182, 1, 3};
            case "ft":
                return new double[]{0.3048, 0.00018939393939394, 0.33333333333333, 1};
        }
return null;
    }


}
