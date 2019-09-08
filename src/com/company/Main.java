package com.company;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int operaciay() throws IOException {
        InputStreamReader b2 = new InputStreamReader(System.in);
        BufferedReader a2 = new BufferedReader(b2);
        byte operaciay = 0;
        boolean q = true;
        System.out.println("Калькулятор выполнет операции с двумя числами от 1 до 10; Применять только целые числа");

        while (q) {
            System.out.println("Введите операцию");
            String x = a2.readLine();
            if (x.equals("/")) {
                System.out.println("Вы ввели операцию деление!");
                q = false;
                operaciay = (byte) 1;
            } else {
                if (x.equals("*")) {
                    System.out.println("Вы ввели операцию умножение!");
                    q = false;
                    operaciay = (byte) 2;
                } else {
                    if (x.equals("+")) {
                        System.out.println("Вы ввели операцию сложение!");
                        q = false;
                        operaciay = (byte) 3;
                    } else {
                        if (x.equals("-")) {
                            System.out.println("Вы ввели операцию вычетание!");
                            q = false;
                            operaciay = (byte) 4;
                        } else {
                            System.out.println("Ошибка ввода операций, повторите!");
                        }
                    }
                }
            }
        }
        return operaciay;
    }

    public static int chislo() throws IOException {
        InputStreamReader b2 = new InputStreamReader(System.in);
        BufferedReader a2 = new BufferedReader(b2);
        int y1 = 0;
        boolean q3 = true;
        while (q3) {
            String x1 = a2.readLine();
            System.out.println("Вы ввели" + x1);
            try {
                y1 = Integer.parseInt(x1);
                System.out.println("Вы ввели число" + y1);
                q3 = false;
            } catch (Exception e) {
                System.out.println("Вы ввели не правильное число" + "Калькулятор выполнет операции с двумя числами от 1 до 10; Применять только целые числа");
            }
            return y1;

        }

    public static void main(String[] args) throws Exception {

        System.out.println("Введите первое число:");
        int y1 = chislo();
        int operaciay = operaciay();
        System.out.println("Введите второе число");
        int y2 = chislo();

        switch (operaciay) {
            case 1: {
                delenie(y1, y2);
            }
            break;
            case 2: {
                umnojenie(y1, y2);
            }
            break;
            case 3: {
                slojenie(y1, y2);
            }
            break;
            case 4: {
                vichetanie(y1, y2);
            }
            break;
            default: {
                System.out.println("Ошибка");
            }
        }
    }
    }
    public static void delenie (int y1, int y2)
    {
        System.out.println("Результат деления:" + (y1 / y2));
    }
    public static void umnojenie (int y1, int y2)
    {
        System.out.println("Результат умножения:" + (y1 * y2));
    }
    public static void slojenie (int y1, int y2)
    {
        System.out.println("Результат сложение:" + (y1 + y2));
    }
    public static void vichetanie (int y1, int y2)
    {
        System.out.println("Результат вычетание:" + (y1 - y2));
    }
}