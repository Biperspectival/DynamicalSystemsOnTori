package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int population = 1000000;
        int iteration = 1;
        int number = 3;
        double r = Math.sqrt(8);

        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new Display(number, r, population, iteration));
        frame.add(new Display(number, r, population, iteration + 1));
        frame.pack();


    }
}
