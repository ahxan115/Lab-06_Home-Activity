/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_ahsan;

/**
 *
 * @author A
 */
public class Calculator {
    public Calculator() {
    }

    static void Sum(int a, int b) {
        System.out.println("Sum is: " + (a + b));
    }

    static void Multiply(int a, int b) {
        System.out.println("Multiply is: " + a * b);
    }

    static void Divide(int a, int b) {
        System.out.println("Divide is: " + a / b);
    }

    static void Modulus(int a, int b) {
        System.out.println("Modulus is: " + a % b);
    }

    static void Sin(double a) {
        System.out.println("SIN: " + Math.sin(a));
    }

    static void Cos(double a) {
        System.out.println("Cos: " + Math.cos(a));
    }

    static void Tan(double a) {
        System.out.println("tan is: " + Math.tan(a));
    }
}

 

