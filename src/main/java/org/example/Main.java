    package org.example;

    import java.awt.*;
    import java.io.Console;

    import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
    import static java.awt.Color.*;

    public class Main {
        // Константы с ANSI-кодами
        public static final String RED = "\u001B[31m";
        public static final String GREEN = "\u001B[32m";
        public static final String RESET = "\u001B[0m";

        public static void main(String[] args) {

            double gamma = 20;
            double beta = 30;
            double delta = 2.5;
            while (gamma != beta)
            {
                gamma += delta;
                System.out.println(GREEN + gamma + RESET );
                System.out.println(RED + "нужно больше" + RESET);
            }

            System.out.println(GREEN + "Okay, let's go" + RESET);


        }
    }