package com.company;

public class Transformation {

    PointSet pointSet;
    int size;
    double r;

    public Transformation(PointSet pointSet, int size, double r) {

        this.pointSet = pointSet;
        this.size = size;
        this.r = r;

    }

    public void transform(double[] target) {
        int[] point = pointSet.getRandomPoint();
        target[0] = target[0]*r + point[0]*(1-r);
        target[1] = target[1]*r + point[1]*(1-r);
        while (target[0] >= size) {
            target[0] = target[0] - size;
        }
        while (target[1] >= size) {
            target[1] = target[1] - size;
        }
        while (target[0] < 0) {
            target[0] = target[0] + size;
        }
        while (target[1] < 0) {
            target[1] = target[1] + size;
        }
    }

    public double[] getPoint(int iterations) {
        double[] target = new double[]{Math.random()*size, Math.random()*size};
        for (int i = 0; i < iterations; i++) {
            transform(target);
        }
        return target;
    }

}
