package com.example.Calculator;

import javax.swing.*;
import java.util.Scanner;

public class Calculator {
    private static boolean its_an_arabic_numbers = true;

    private static String[] pars(String input) throws NumberException {
        String[] parsed_input = input.split(" ");
        while (true) {
            if (parsed_input.length == 1) {
                throw new NumberException("строка не является математической операцией");
            }
            while (true) {
                if (parsed_input.length == 3) {
                    return parsed_input;
                } else
                    throw new NumberException("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            }
        }
    }

    public static void main(String[] args) throws NumberException {

        Scanner input_a_value = new Scanner(System.in);
        System.out.print("Введите выражение: ");
        String input = input_a_value.nextLine();
        while (true)
            while (!input.isEmpty()) {
                String[] parsed_input = Calculator.pars(input);
                String operation = parsed_input[1];
                Number values;
                int value1 = 0;
                int value2 = 0;
                // Переводим в int. Если введены римские, выкинет исключение

                try {

                    value1 = Integer.parseInt(parsed_input[0]);
                    value2 = Integer.parseInt(parsed_input[2]);
                    //values = new Arabic(value1, value2, 0);


                }catch(NumberFormatException e){

                    its_an_arabic_numbers = false;
                    System.out.println("Введены римские цифры");
                    //values = new Romes(parsed_input[0], parsed_input[2], 0);
                }
                if (its_an_arabic_numbers) {
                    values = new Arabic(value1, value2);

                } else {
                    values = new Romes(parsed_input[0], parsed_input[2]);
                }


                if (operation.equals("+")) {
                    values.sum();
                } else if (operation.equals("-")) {
                    values.sub();
                } else if (operation.equals("/") || operation.equals(":")) {
                    values.div();
                } else if (operation.equals("*") || operation.equals("x")) {
                    values.mul();
                }

                if (its_an_arabic_numbers) {
                    System.out.println("Ответ: " + values.getResult());
                } else {
                    System.out.println("Ответ: " + values.getStringResult());
                }
                System.out.println();
                System.out.print("Введите следующее выражение: ");
                input = input_a_value.nextLine();
            }

    }
}