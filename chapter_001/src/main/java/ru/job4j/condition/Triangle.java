package ru.job4j.condition;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double period(double ab, double ac, double bc){
        return ((ab + ac + bc)/2);
    }

    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(b);
        double ac = this.a.distanceTo(c);
        double bc = this.b.distanceTo(c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt((( p - ab)*(p - ac)*(p - bc) * p));
        }
        return rsl;
    }

    private boolean exist(double ab, double ac, double bc) {
        if ((ab<ac+bc)&&(bc<ac+ab)&&(ac<bc+ab)) {
            return true;
        }else {
            return false;
        }
    }
}
