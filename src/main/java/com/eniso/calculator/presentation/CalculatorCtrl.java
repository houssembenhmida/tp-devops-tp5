/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso.calculator.presentation;

import com.eniso.calculator.enumeration.MathematicalOperations;
import com.eniso.calculator.service.CalculatorService;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Houssem
 */
@ManagedBean
public class CalculatorCtrl {

    private final Model model = new Model();
    private final CalculatorService service = new CalculatorService();

    public Model getModel() {
        return model;
    }

    public void result() {
        getModel().setResult(service.result(getModel().getA(), getModel().getB(), getModel().getOperator()));
    }

    public MathematicalOperations[] getOperations() {
        return MathematicalOperations.values();
    }

    public class Model {

        private float a;
        private float b;
        private MathematicalOperations operator;
        private String result;

        public MathematicalOperations getOperator() {
            return operator;
        }

        public void setOperator(MathematicalOperations operator) {
            this.operator = operator;
        }

        public float getA() {
            return a;
        }

        public void setA(float a) {
            this.a = a;
        }

        public float getB() {
            return b;
        }

        public void setB(float b) {
            this.b = b;
        }

       

        public String getResult() {
            return result;
        }

        public void setResult(String result) {
            this.result = result;
        }

    }
}
