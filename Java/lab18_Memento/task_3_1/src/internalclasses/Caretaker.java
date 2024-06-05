import java.util.Stack;

public class Caretaker {

    private final Triangle triangle;
    private final Stack<Triangle.Memento> history = new Stack<>();

    public Caretaker(Triangle triangle) {
        this.triangle = triangle;
    }

    public void changeA(float a){
        final Triangle.Memento memento = triangle.save();
        history.push(memento);

        triangle.setA(a);
    }
    public void changeB(float b){
        final Triangle.Memento memento = triangle.save();
        history.push(memento);

        triangle.setB(b);
    }
    public void changeC(float c){
        final Triangle.Memento memento = triangle.save();
        history.push(memento);

        triangle.setC(c);
    }

    public void undo(){
        if (history.empty()){
            return;
        }

        final Triangle.Memento memento = history.pop();
        triangle.restore(memento);
    }

}