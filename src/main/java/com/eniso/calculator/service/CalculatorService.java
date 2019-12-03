/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.calculator.service;

import com.eniso.calculator.enumeration.MathematicalOperations;

/**
 *
 * @author Houssem
 */
public class CalculatorService {

    int x;

    public String addition(float a, float b) {
        return Float.toString(a + b);
    }

    public String subtraction(float a, float b) {
        return Float.toString(a - b);
    }

    public String multiplication(float a, float b) {
//        float res=a*b;
        return Float.toString(a*b);
    }

    public String division(float a, float b) {
        if (b == 0) {
            return "ERROR";
        }
        return Float.toString(a / b);
    }

    public String result(float a, float b, MathematicalOperations operation) {
        try {
            if (operation.equals(MathematicalOperations.ADDITION)) {
                return addition(a, b);
            }
            if (operation.equals(MathematicalOperations.SUBTRACTION)) {
                return subtraction(a, b);
            }
            if (operation.equals(MathematicalOperations.MULTIPLICATION)) {
                return multiplication(a, b);
            }
            if (operation.equals(MathematicalOperations.DIVISION)) {
                return division(a, b);
            }
        } catch (Exception e) {
        }
        return "ERROR OPERATOR";
    }

}
