/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.calculator.enumeration;

/**
 *
 * @author Houssem
 */
public enum MathematicalOperations {
    ADDITION("Addition"),
    SUBTRACTION("Subtraction"),
    MULTIPLICATION("Multiplication"),
    DIVISION("Division");
    private String label;

    private MathematicalOperations(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
