package factory;

import equation.BiQuadraticEquation;
import equation.Equation;

public class BiQuadraticEquationFactory extends EquationFactory {
    @Override
    public Equation create() {
        return new BiQuadraticEquation(coefficients.get(0), coefficients.get(1), coefficients.get(2), coefficients.get(3), coefficients.get(4));
    }
}