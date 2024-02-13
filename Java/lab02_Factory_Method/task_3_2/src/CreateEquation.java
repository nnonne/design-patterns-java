import factory.BiQuadraticEquationFactory;
import factory.EquationFactory;
import factory.QuadraticEquationFactory;

import java.util.ArrayList;

public class CreateEquation {
    private ArrayList<Double> coefficients;

    public void setCoefficients(ArrayList<Double> coefficients) {
        this.coefficients = coefficients;
    }
    public EquationFactory define() {
        if (coefficients.size() == 2) {
            EquationFactory eq = new EquationFactory();
            eq.setCoefficients(coefficients);
            return eq;
        }
        else if (coefficients.size() == 3) {
            EquationFactory eq = new QuadraticEquationFactory();
            eq.setCoefficients(coefficients);
            return eq;
        }
        EquationFactory eq = new BiQuadraticEquationFactory();
        eq.setCoefficients(coefficients);
        return eq;
    }
}
