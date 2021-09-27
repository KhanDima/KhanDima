package com.example.Calculator;

public class Romes extends Number {
    private String romes_value1;
    private String romes_value2;
    private int romes_value1_int;
    private int romes_value2_int;
    private int result_int;
    private String k = "";
    private String result_string;
    final String[] roman_letters_9 = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    Romes(String value1, String value2) {
        this.romes_value1 = value1;
        this.romes_value2 = value2;
        this.romes_value1_int = convert_to_int(romes_value1);
        this.romes_value2_int = convert_to_int(romes_value2);
    }
    private String convert_result_to_Romes(int n, int ostatok) {
        if (ostatok != 0) {
            return convert_result_to_Romes(n - ostatok, 0) + roman_letters_9[ostatok - 1];
        }
        return k;
    }

    @Override
    public void sum() throws NumberException {
        while (true) {
            result_int = romes_value1_int + romes_value2_int;
            result_string = convert_result_to_Romes(result_int, result_int);
            if (romes_value1_int < 1 || romes_value1_int>10 || romes_value2_int < 1 || romes_value2_int > 10){
                throw new NumberException("Введите число от I до X");
            }
            System.out.println("Ответ" + " " + result_string);
            System.exit(1);
        }


    }
    @Override
    public void sub() throws NumberException {
        while (true) {
            result_int = romes_value1_int - romes_value2_int;
            result_string = convert_result_to_Romes(result_int, result_int);
            if (romes_value1_int < 1 || romes_value1_int>10 || romes_value2_int < 1 || romes_value2_int > 10){
                throw new NumberException("Введите число от I до X");
            }
            System.out.println("Ответ" + " " + result_string);
            System.exit(1);
        }

    }

    @Override
    public void div() throws NumberException {
        //Я мог сделать так, но легче было в switch case )
        //  try {
        while (true) {
            result_int = romes_value1_int / romes_value2_int;
            result_string = convert_result_to_Romes(result_int, result_int);
            if (romes_value1_int < 1 || romes_value1_int>10 || romes_value2_int < 1 || romes_value2_int > 10){
                throw new NumberException("Введите число от I до X");
            }
            System.out.println("Ответ" + " " + result_string);
            System.exit(1);
        }
        //} catch (ArithmeticException e) {
        //  System.out.print("Проверьте правильность ввода римских цифр. Вероятно введены и арабские и римские одновременно. ");
        //return;
        //}
    }

    @Override
    public void mul() throws NumberException {
        while (true) {
            result_int = romes_value1_int * romes_value2_int;
            result_string = convert_result_to_Romes(result_int, result_int);
            if (romes_value1_int < 1 || romes_value1_int>10 || romes_value2_int < 1 || romes_value2_int > 10){
                throw new NumberException("Введите число от I до X");
            }
            System.out.println("Ответ" + " " + result_string);
            System.exit(1);
        }
    }

    @Override
    public int getResult() {
        return result_int;
    }
    public String getStringResult() {
        return result_string;
    }

    private static int convert_to_int(String romes_value){
        char[] value_char = romes_value.toCharArray();
        int[] values_int = new int[value_char.length];
        for (int i = 0; i < value_char.length; i++) {
            if (value_char[i] == 'I') {
                values_int[i] = 1;
            } else if (value_char[i] == 'V') {
                values_int[i] = 5;
            } else if (value_char[i] == 'X') {
                values_int[i] = 10;
            } else if (value_char[i] == 'L') {
                values_int[i] = 50;
            } else if (value_char[i] == 'C') {
                values_int[i] = 100;
            }else {
                System.out.println("Используются одновременно разные системы счисления");
                System.exit(1);
            }
        }
        int result = values_int[0];
        for (int i = 0; i < values_int.length && values_int.length > i + 1; i++) {
            if (values_int[i] >= values_int[i+1]) {
                result += values_int[i+1];
            } else if (values_int[i] < values_int[i+1]) {
                result = result + values_int[i+1] - 2;
            }
        }
        return result;
    }

    public String getRomes_value1() {
        return romes_value1;
    }

    public String getRomes_value2() {
        return romes_value2;
    }

    public void setRomes_value1(String romes_value1) {
        this.romes_value1 = romes_value1;
    }

    public void setRomes_value2(String romes_value2) {
        this.romes_value2 = romes_value2;
    }

    public int getRomes_value1_int() {
        return romes_value1_int;
    }

    public int getRomes_value2_int() {
        return romes_value2_int;
    }

    public void setRomes_value1_int(int romes_value1_int) {
        this.romes_value1_int = romes_value1_int;
    }

    public void setRomes_value2_int(int romes_value2_int) {
        this.romes_value2_int = romes_value2_int;
    }
}