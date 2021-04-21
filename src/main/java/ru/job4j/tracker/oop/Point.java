package ru.job4j.tracker.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * метод определяет расстояние между двумя точками в двухмерном пространстве
     * исходной точкой и точкой входного параметра  - с координатами x, y.
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * метод определяет расстояние между двумя точками в трехмерном пространстве
     * исходной точкой и точкой входного параметра  - с координатами x, y, z.
     *
     */
    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(4, 2, 0);
        Point b = new Point(0, 2, 4);
        double dist = a.distance(b);
        double dist3D = a.distance3d(b);
        System.out.println(dist);
        System.out.println(dist3D);
    }

}