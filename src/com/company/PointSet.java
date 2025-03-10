package com.company;

public class PointSet {

    private int[] xValues;
    private int[] yValues;

    public PointSet(int size, int number) {
        xValues = new int[number];
        yValues = new int[number];

        double proportion = Math.PI*2/number;
        double rotation = 0;
        double radius = size*0.4;

        for (int i = 0; i < number; i++) {
            xValues[i] = (int)(Math.cos(rotation)*radius) + size/2;
            yValues[i] = (int)(Math.sin(rotation)*radius) + size/2;
            rotation += proportion;
        }

    }

    public int[] getRandomPoint() {
        int index = Utility.getRandomInt(xValues.length);
        return new int[]{xValues[index], yValues[index]};
    }

}
