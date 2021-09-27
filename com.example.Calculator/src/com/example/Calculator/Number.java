package com.example.Calculator;

public abstract class Number {


    public abstract void sum() throws NumberException;

    public abstract void sub() throws NumberException;

    public abstract void div() throws NumberException;

    public abstract void mul() throws NumberException;

    public abstract int getResult();
    public abstract String getStringResult();
}