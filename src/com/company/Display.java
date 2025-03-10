package com.company;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    public static final int SIZE = 500;
    public static final int ALPHA = 30;

    Transformation transformation;
    int population;
    int iteration;

    public Display(int number, double r, int population, int iteration) {
        transformation = new Transformation(new PointSet(SIZE, number), SIZE, r);
        this.population = population;
        this.iteration = iteration;
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0,0,SIZE,SIZE);


        g.setColor(new Color(255, 255, 255, ALPHA));
        for (int i = 0; i < population; i ++) {
            drawPoint(g, transformation.getPoint(iteration));
        }
    }

    private void drawPoint(Graphics g, double[] point) {
        g.drawLine((int)point[0], (int)point[1], (int)point[0], (int)point[1]);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(SIZE, SIZE);
    }




}
