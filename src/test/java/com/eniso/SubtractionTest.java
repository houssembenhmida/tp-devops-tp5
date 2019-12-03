/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eniso;

import com.eniso.calculator.service.CalculatorService;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Houssem
 */
public class SubtractionTest {

    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("199.0", service.subtraction(200, 1));
        assertEquals("0.0", service.subtraction(1, 1));
    }
}
