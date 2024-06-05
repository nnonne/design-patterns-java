public class Client {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 3, 3);
        Caretaker caretaker = new Caretaker();
        caretaker.push(triangle.save());

        String[] edges = {"b", "c", "a", "c", "b"};

        float[] values = {4, 5, 4, 2, 3};

        float maxSquare = triangle.square();

        for (int index = 0; index < edges.length; index++) {
            switch (edges[index]) {
                case "a":
                    triangle.setA(values[index]);
                    break;
                case "b":
                    triangle.setB(values[index]);
                    break;
                case "c":
                    triangle.setC(values[index]);
                    break;
            }
            caretaker.push(triangle.save());

            float temp = triangle.square();
            if (maxSquare <= temp) {
                maxSquare = temp;
            }
            System.out.println("Volume = " + temp);
        }


        for (int i = 0; i < edges.length; i++) {
            if (Math.abs(triangle.square() - maxSquare) < 0.0000001) {
                break;
            }
            caretaker.undo();
        }

        System.out.printf("Max Volume (%f) has triangle with edges: %f, %f, %f", maxSquare, triangle.getA(), triangle.getB(), triangle.getC());

    }

}