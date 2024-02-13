package equation;

import java.lang.Math;

public class BiQuadraticEquation extends QuadraticEquation {
    //ex^4 + dx^3 + cx^2 + bx + a
    protected double e = 0;
    protected double d = 0;
    public BiQuadraticEquation(double e, double d, double c, double b, double a) {
        super(c, b, a);
        this.e = e;
        this.d = d;
    }

    @Override
    public double[] solve() {
        if ( (e == 0 && d != 0) || (e != 0 && (d != 0 || b != 0)) ) {
            System.out.println("This is not a BiQuadratic equation");
            return new double[]{Double.NaN};
        }

        if (e == 0) {
            return super.solve();
        }
        else if (e != 0 && c == 0) {
            if (-a/e < 0) {
                System.out.println("No roots");
                return new double[]{Double.NaN};
            }
            else if (a == 0) {
                return new double[]{0};
            }
            else {
                return new double[]{Math.sqrt(Math.sqrt(-a/e)), -Math.sqrt(Math.sqrt(-a/e))};
            }
        }
        else if (a != 0 && a == 0) {
            return new double[]{0, Math.sqrt(-c/a), Math.sqrt(-c/a)};
        }
        else {
            Equation eq = new QuadraticEquation(e, c, a);
            double[] roots = eq.solve();

            if (Double.isNaN(roots[0])) {
                return roots;
            }

            if (roots.length == 1) {
                if (roots[0] < 0) {
                    System.out.println("Complex roots");
                    return new double[]{Double.NaN};
                }
                else if (roots[0] == 0) {
                    return roots;
                }
                return new double[]{Math.sqrt(roots[0]), -Math.sqrt(roots[0])};
            }
            if (roots[0] < 0 && roots[1] < 0) {
                System.out.println("Complex roots");
                return new double[]{Double.NaN};
            }
            else if (roots[0] > 0 && roots[1] > 0) {
                return new double[]{Math.sqrt(roots[0]), -Math.sqrt(roots[0]), Math.sqrt(roots[1]), -Math.sqrt(roots[1])};
            }
            else if (roots[0] < 0 && roots[1] > 0) {
                return new double[]{Math.sqrt(roots[1]), -Math.sqrt(roots[1])};
            }
            else if (roots[1] < 0 && roots[0] > 0) {
                return new double[]{Math.sqrt(roots[0]), -Math.sqrt(roots[0])};
            }
            else if (roots[0] > 0 && roots[1] == 0) {
                return new double[]{0, Math.sqrt(roots[0]), -Math.sqrt(roots[0])};
            }
            else if (roots[1] > 0 && roots[0] == 0) {
                return new double[]{0, Math.sqrt(roots[1]), -Math.sqrt(roots[1])};
            }
            return new double[]{0};
        }
    }

    @Override
    public String toString() {
        return e + "*x^4+" + d + "*x*3+" + c + "*x^2+" + b + "*x+" + a + "=0";
    }
}
