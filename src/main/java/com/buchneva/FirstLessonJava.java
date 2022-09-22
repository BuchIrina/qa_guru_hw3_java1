package com.buchneva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstLessonJava {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Overflow:
        byte firstExample = (byte) 200;
        short secondExample = (short) (Short.MAX_VALUE + 1);
        byte thirdExample = (byte) (Byte.MIN_VALUE - 1);
        System.out.println("Overflow byte = 200: " + firstExample);
        System.out.println("Overflow max short + 1: " + secondExample);
        System.out.println("Overflow min byte  - 1: " + thirdExample);

        System.out.println("");

        //Arithmetic Operators and Logical Operators:
        System.out.println("Please, enter two any numbers:");

        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println("Please, enter \"+\" or \"-\" or \"*\" or \"/\". If you want to finish click \"Enter\".");

        String action = null;
        int result = 0;

        do {
            action = reader.readLine();
            if (action.equals("+") || action.equals("-") || action.equals("/") || action.equals("*")) {
                if (action.equals("+")) {
                    result = number1 + number2;
                } else if (action.equals("-")) {
                    result = number1 - number2;
                } else if (action.equals("*")) {
                    result = number1 * number2;
                } else if (action.equals("/")) {
                    result = number1 / number2;
                }

                System.out.println(result);

            } else {
                System.out.println("You entered an invalid operator. Please, inter \"+\" or \"-\" or \"*\" or \"/\"");
            }

        } while (!action.isEmpty());


        // Comparison Operators:
        if (number1 >= number2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


        // Precedence of operator:
        System.out.println("Precedence of operators: " + (number1 + number2 * 2));


        // Sum int and double:
        int whole = 15;
        double withPoint = 5.5;

        int sum1 = whole + (int) withPoint;
        System.out.println("If sum int = " + sum1);
        double sum2 = withPoint + whole;
        System.out.println("If sum double = " + sum2);
    }
}
