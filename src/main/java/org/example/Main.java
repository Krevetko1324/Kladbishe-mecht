package org.example;

import java.awt.*;
import java.io.Console;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.Constants.RESET;
import static java.awt.Color.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        //System.out.println("Hello and goodbye PRESS F !");
        //Color color = SystemColor.getColor(String.valueOf(yellow));
        //String s = "gamer";
       // System.out.println(s);
       // Color color1 = getColor(s);
        double gamma = 20;
        double beta = 30;
        double delta = 2.5;
        while (gamma != beta)
        {
            gamma += delta;
            System.out.println(gamma);
            System.out.println("нужно больше");
        }

        System.out.println("Okay, let's go");

    }

}