    package org.example;

    import java.awt.*;
    import java.io.Console;

    import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
    import static java.awt.Color.*;


    public class Main {
        // Константы с ANSI-кодами
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String RESET = "\u001B[0m";

        public static void main(String[] args)
        {
            double gamma = 10;
            double beta = 30;
            double delta = 2.5;

            System.out.println(YELLOW + "Начальное значение gamma: " + gamma + RESET);

            while (gamma < beta) {
                gamma += delta;
                System.out.println(GREEN + "Текущее gamma: " + gamma + RESET);


                if (gamma < beta) {
                    System.out.println(RED + "Нужно больше!" + RESET);
                }

                // Защита от бесконечного цикла
                if (gamma > beta - 0.0001) {
                    gamma = beta;
                }
            }

            System.out.println(GREEN + "Okay, let's go! Final gamma: " + gamma + RESET);
        }
    }