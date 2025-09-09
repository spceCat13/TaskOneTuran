package com.punpun;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int userNumberFirst = 0;
            int userNumberSecond = 0;

            // ввод первого числа
            while (true) {
                System.out.println("Введите первое число (или 'exit' для выхода):");
                if (scanner.hasNextInt()) {
                    userNumberFirst = scanner.nextInt();
                    break;
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Выход из программы.");
                        return;
                    }
                    System.out.println("Вы ввели не число. Повторите попытку.");
                }
            }

            // ввод второго числа
            while (true) {
                System.out.println("Введите второе число (или 'exit' для выхода):");
                if (scanner.hasNextInt()) {
                    userNumberSecond = scanner.nextInt();
                    break;
                } else {
                    String input = scanner.next();
                    if (input.equalsIgnoreCase("exit")) {
                        System.out.println("Выход из программы.");
                        return;
                    }
                    System.out.println("Вы ввели не число. Повторите попытку.");
                }
            }

            String operation;
            int result = 0;

            // ввод операции
            while (true) {
                System.out.println("Введите операцию (дел, выч, слож, умн или exit):");
                operation = scanner.next();

                if (operation.equalsIgnoreCase("exit")) {
                    System.out.println("Выход из программы.");
                    return;
                }

                switch (operation.toLowerCase()) {
                    case "дел":
                        if (userNumberSecond == 0) {
                            System.out.println("Ошибка: деление на ноль! Введите другое число или операцию.");
                            break;
                        }
                        result = MathOpers.division(userNumberFirst, userNumberSecond);
                        System.out.println("Результат: " + result);
                        break;
                    case "выч":
                        result = MathOpers.subtraction(userNumberFirst, userNumberSecond);
                        System.out.println("Результат: " + result);
                        break;
                    case "слож":
                        result = MathOpers.addition(userNumberFirst, userNumberSecond);
                        System.out.println("Результат: " + result);
                        break;
                    case "умн":
                        result = MathOpers.multiplication(userNumberFirst, userNumberSecond);
                        System.out.println("Результат: " + result);
                        break;
                    default:
                        System.out.println("Некорректный ввод. Повторите попытку.");
                        continue; // остаёмся в этом же цикле
                }
                break; // операция корректная, выходим из while(true)
            }
        }
    }
}
