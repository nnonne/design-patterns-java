import equation.BiQuadraticEquation;
import equation.Equation;
import equation.QuadraticEquation;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Equation> equations = new ArrayList<>();
        equations.add(new Equation(5,7));
        equations.add(new QuadraticEquation(3,4,5));
        equations.add(new BiQuadraticEquation(4, 5, 6, 7, 8));

        System.out.println("Original equations:");
        for (Equation equation : equations) {
            System.out.println(equation);
        }

        List<Equation> copies = new ArrayList<>();
        for (Equation equation : equations) {
            copies.add(equation.copy());
        }

        System.out.println("Copies of these equations:");
        for (Equation copy : copies) {
            System.out.println(copy);
        }
    }
}