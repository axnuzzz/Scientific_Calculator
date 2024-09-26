package com.calculator;

   import java.lang.Math;

   public class ScientificCalculator {
       public double squareRoot(double x) {
           return Math.sqrt(x);
       }

       public long factorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (x == 0 || x == 1) return 1;
        return x * factorial(x - 1);
    }
    
    public double naturalLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Natural logarithm is not defined for non-positive numbers");
        }
        return Math.log(x);
    }

       public double power(double x, double b) {
           return Math.pow(x, b);
       }
   }