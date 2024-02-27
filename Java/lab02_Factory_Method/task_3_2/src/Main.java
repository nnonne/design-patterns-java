import machinefactory.EquationFactory;

import java.io.*;
import java.util.ArrayList;

public class Main {
    static CreateEquation defineEquation = new CreateEquation();
    public static void processFile(String file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(file)));
        ArrayList<Double> list = new ArrayList<Double>();
        String line;
        while ((line = br.readLine()) != null) {
            String[] r = line.trim().split("\\s+");
            if (r[0].equals("")) {
                break;
            }
            for (int i = 0; i < r.length; i++) {
                Double val = Double.parseDouble(r[i]);
                list.add(val);
            }

            defineEquation.setCoefficients(list);
            EquationFactory equation = defineEquation.define();
            double[] roots = equation.solveEq();
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
            }
            System.out.println("");
            list.clear();
        }
        br.close();
    }
    public static void main(String[] args) throws Exception {
        String file1 = "D:\\studying\\master\\design-patterns-java\\Java\\lab02_Factory_Method\\task_3_2\\src\\data\\input01.txt";
        String file2 = "D:\\studying\\master\\design-patterns-java\\Java\\lab02_Factory_Method\\task_3_2\\src\\data\\input02.txt";
        String file3 = "D:\\studying\\master\\design-patterns-java\\Java\\lab02_Factory_Method\\task_3_2\\src\\data\\input03.txt";

        processFile(file1);
        processFile(file2);
        processFile(file3);


    }
}