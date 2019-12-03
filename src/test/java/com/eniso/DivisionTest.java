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
public class DivisionTest {

    CalculatorService service = new CalculatorService();

    @Test
    public void Test() {
        assertEquals("200.0", service.division(200, 1));
        assertEquals("1.0", service.division(1, 1));
        assertEquals("ERROR", service.division(1, 0));
    }
}
