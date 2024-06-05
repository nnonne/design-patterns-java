public class ConcreteMemento implements Memento {

    final private float a;
    final private float b;
    final private float c;

    public ConcreteMemento(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

}