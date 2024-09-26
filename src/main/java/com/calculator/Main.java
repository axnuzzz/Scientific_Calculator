package com.calculator;

   import java.util.Scanner;

   public class Main {
       public static void main(String[] args) {
           ScientificCalculator calc = new ScientificCalculator();
           Scanner scanner = new Scanner(System.in);

           while (true) {
               System.out.println("\nScientific Calculator Menu:");
               System.out.println("1. Square Root");
               System.out.println("2. Factorial");
               System.out.println("3. Natural Logarithm");
               System.out.println("4. Power");
               System.out.println("5. Exit");
               System.out.print("Enter your choice: ");

               int choice = scanner.nextInt();

               switch (choice) {
                   case 1:
                       System.out.print("Enter a number: ");
                       double sqrtNum = scanner.nextDouble();
                       System.out.println("Square root: " + calc.squareRoot(sqrtNum));
                       break;
                   case 2:
                       System.out.print("Enter a number: ");
                       int factNum = scanner.nextInt();
                       System.out.println("Factorial: " + calc.factorial(factNum));
                       break;
                   case 3:
                       System.out.print("Enter a number: ");
                       double logNum = scanner.nextDouble();
                       System.out.println("Natural logarithm: " + calc.naturalLog(logNum));
                       break;
                   case 4:
                       System.out.print("Enter base: ");
                       double base = scanner.nextDouble();
                       System.out.print("Enter exponent: ");
                       double exponent = scanner.nextDouble();
                       System.out.println("Result: " + calc.power(base, exponent));
                       break;
                   case 5:
                       System.out.println("Exiting...");
                       System.exit(0);
                   default:
                       System.out.println("Invalid choice. Please try again.");
               }
           }
       }
   }