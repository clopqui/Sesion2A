/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.sesion2a;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author chris
 */
public class CalculadoraTest {
    private int a;
    private int b;
    
    public CalculadoraTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
        a = 10;
        b = 5;
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of suma method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSuma() {
        System.out.println("suma");
        int expResult = 15;
        int result = Calculadora.suma(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testResta() {
        System.out.println("resta");
        int expResult = 5;
        int result = Calculadora.resta(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int expResult = 50;
        int result = Calculadora.multiplica(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDivide() {
        System.out.println("divide");
        int expResult = 2;
        int result = Calculadora.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of divide method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDividePor0() {
        System.out.println("divide");
        b=0;
        int expResult = -1;
        int result = Calculadora.divide(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
