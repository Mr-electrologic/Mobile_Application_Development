package com.example.mycalculator;

import java.util.regex.Pattern;

public class Calculator {
    private String equation, strOp;
    private double operand1, operand2, value;
    private String operator;
    private int loc;

    public Calculator(){
        equation = "";
        operator = "";
        operand1 = 0;
        operand2 = 0;
        loc = -1;
        value = 0;
        strOp = "";
    }

    public void setTerm(String term) {
        switch (term) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "0":
            case ".":
                strOp += term;
                if (operator.equals("")) {
                    operand1 = Double.parseDouble(strOp);
                    if (strOp.startsWith("-")) {
                        operand1 *= -1.0;
                    }
                }
                else {
                    operand2 = Double.parseDouble(strOp);
                    if (strOp.startsWith("-")) {
                        operand2 *= -1.0;
                    }
                    this.calcNow();
                }
                equation += term;
                break;
            case "+":
            case "-":
            case "/":
            case "*":
                if (!equation.equals("")) {
                    operator = term;
                    loc = equation.length() - 1;
                }
                strOp = "";
                equation += term;
                break;
            case "+/-":
                equation += equation.substring(0, loc) + "(-" + strOp + ")";
                break;
        }
    }

    public String getOps() {
        return "O1: " + operand1 + "; O2: " + operand2;
    }

    private void calcNow() {
        switch (operator) {
            case "+":
                value = operand1 + operand2;
                break;
            case "-":
                value = operand1 - operand2;
                break;
            case "/":
                value = operand1 / operand2;
                break;
            case "*":
                value = operand1 * operand2;
                break;
        }
        operand2 = 0;
    }

    public String getEquation() {
        return equation;
    }

    public String getValue () {
        equation = "";
        operator = "";
        operand1 = 0;
        operand2 = 0;
        loc = -1;
        strOp = "";
        return "" + value;
    }
}
