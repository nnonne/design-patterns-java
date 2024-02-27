package machinefactory;

import equation.Equation;
import equation.QuadraticEquation;

public class QuadraticEquationFactory extends EquationFactory {
    @Override
    public Equation create() {
        return new QuadraticEquation(coefficients.get(0), coefficients.get(1), coefficients.get(2));
    }
}
