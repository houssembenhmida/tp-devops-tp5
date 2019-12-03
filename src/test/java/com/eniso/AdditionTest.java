package com.eniso;


import com.eniso.calculator.service.CalculatorService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Houssem
 */
public class AdditionTest {

    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("2.0", service.addition(1, 1));
        assertEquals("201.0", service.addition(200, 1));
    }

}
