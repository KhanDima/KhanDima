package com.example.Calculator;

public class Arabic extends Number {

    private int value1;
    private int value2;
    private int result;

    Arabic(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() throws NumberException {
        while (true) {
            this.result = value1 + value2;
            if (value1 < 1 || value1>10 || value2 < 1 || value2 > 10){
                throw new NumberException("Введите число от 1 до 10");
            }
            System.out.println("Ответ" + " " + result);
            System.exit(1);
        }
    }

    public void sub() throws NumberException {
        while (true) {
            this.result = value1 - value2;
            if (value1 < 1 || value1>10 || value2 < 1 || value2 > 10){
                throw new NumberException("Введите число от 1 до 10");
            }
            System.out.println("Ответ" + " " + result);
            System.exit(1);
        }
    }


    public void div() throws NumberException {
        while (true) {
            this.result = value1 / value2;
            if (value1 < 1 || value1>10 || value2 < 1 || value2 > 10){
                throw new NumberException("Введите число от 1 до 10");
            }
            System.out.println("Ответ" + " " + result);
            System.exit(1);
        }
    }


    public void mul() throws NumberException {
        while (true) {
            this.result = value1 * value2;
            if (value1 < 1 || value1>10 || value2 < 1 || value2 > 10){
                throw new NumberException("Введите число от 1 до 10");
            }
            System.out.println("Ответ" + " " + result);
            System.exit(1);
        }
    }

    @Override
    public int getResult() {
        return result;
    }

    @Override
    public String getStringResult() {
        return "" + result;
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }
}
