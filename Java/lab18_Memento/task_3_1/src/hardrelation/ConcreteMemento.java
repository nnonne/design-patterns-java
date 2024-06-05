public class ConcreteMemento implements Memento {

    final private float a;
    final private float b;
    final private float c;
    final private Triangle triangle;

    public ConcreteMemento(float a, float b, float c, Triangle triangle) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.triangle = triangle;
    }

    public float getA(){
        return a;
    }
    public float getB(){
        return b;
    }
    public float getC(){
        return c;
    }

    @Override
    public void restore() {
        triangle.setA(a);
        triangle.setB(b);
        triangle.setC(c);
    }

}