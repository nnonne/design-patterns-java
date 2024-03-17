package equation;

import java.lang.Math;

public class QuadraticEquation extends Equation {
    //cx^2 + bx + a
    protected double c = 0;
    public QuadraticEquation(double c, double b, double a) {
        super(b, a);
        this.c = c;
    }
    public QuadraticEquation(QuadraticEquation other){
        super(other);
        this.c = other.c;
    }

    @Override
    public double[] solve() {
        double D = b*b - 4*a*c;
        if (c == 0) {
            return super.solve();
        }
        else if (D < 0) {
            System.out.println("Complex roots");
            return new double[]{Double.NaN};
        }
        else if (D == 0) {
            return new double[]{-b/(2*c)};
        }
        return new double[]{(-b - Math.sqrt(D))/(2*c), (-b + Math.sqrt(D))/(2*c)};
    }

    @Override
    public String toString() {
        return c + "*x^2+" + b + "*x+" + a + "=0";
    }

    @Override
    public QuadraticEquation copy() {
        return new QuadraticEquation(this);
    }
}
