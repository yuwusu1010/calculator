package day01;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int firstNumber;
        int secondNumber;
        char operator;

        while (true) {
            try {
                //ask user enter number and operator
                System.out.println("enter a number ");
                firstNumber = sc.nextInt();
                System.out.println("enter second number ");
                secondNumber = sc.nextInt();
                System.out.println("pls select a math operator(+,-,*,/)");
                operator = sc.next().charAt(0);
                //check the operator
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                } else {
                    System.out.println("pls select a valid math operator ");
                }
            } catch (Exception e) {
                System.out.println("pls only enter a number ");
                sc.nextLine();
            }

        }
        sc.close();
        // do the calculation
        if (operator == '+') {
            System.out.println("result of this calculation is = " + (firstNumber + secondNumber));
        } else if (operator == '-') {
            System.out.println(" result of this calculation is = " + (firstNumber - secondNumber));

        } else if (operator == '*') {
            System.out.println("result of this calculation is = " + (firstNumber * secondNumber));
        } else {
            if (secondNumber == 0) {
                System.out.println("undefined");
            } else {
                double result = (double) firstNumber / secondNumber;
                System.out.println("result of this calculation is = " + result);

            }

        }
    }
}




