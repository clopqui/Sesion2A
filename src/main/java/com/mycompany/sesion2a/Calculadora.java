/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sesion2a;

/**
 *
 * @author chris
 */
public class Calculadora {
    
    public static int suma(int a, int b){
        return a+b;
    }
    
    public static int resta(int a, int b){
        return a-b;
    }
    
    public static int multiplica(int a, int b){
        return a*b;
    }
    
    public static int divide(int a, int b){
        return (b==0)?-1:(a/b);
    }
}
