package equation;

public class Equation {
    //bx+c=0
    protected double b = 0;
    protected double a = 0;

    public Equation(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public double[] solve() {
        if (b == 0 && a == 0) {
            System.out.println("Any number is root");
            double[] roots = {Double.POSITIVE_INFINITY};
            return roots;
        }
        else if (b == 0) {
            System.out.println("No roots");
            double[] roots = {Double.NaN};
            return roots;
        }
        else {
            double[] roots = {-a/b};
            return roots;
        }
    }

    @Override
    public String toString() {
        return b + "*x + " + a + " = 0";
    }
}
