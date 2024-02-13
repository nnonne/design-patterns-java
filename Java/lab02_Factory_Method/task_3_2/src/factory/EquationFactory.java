package factory;

import equation.Equation;

import java.util.ArrayList;

public class EquationFactory {
    protected ArrayList<Double> coefficients;

    public void setCoefficients(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }
    public double[] solveEq() {
        Equation eq = create();
        System.out.println(eq);
        return eq.solve();
    }

    public Equation create() {
        return new Equation(coefficients.get(0), coefficients.get(1));
    }
}
