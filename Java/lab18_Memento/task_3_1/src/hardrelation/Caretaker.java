import java.util.Stack;

public class Caretaker {

    private final Stack<Memento> history = new Stack<>();

//    public void changeA(float a){
//        final Memento memento = triangle.save();
//        history.push(memento);
//
//        triangle.setA(a);
//    }
//    public void changeB(float b){
//        final Memento memento = triangle.save();
//        history.push(memento);
//
//        triangle.setB(b);
//    }
//    public void changeC(float c){
//        final Memento memento = triangle.save();
//        history.push(memento);
//
//        triangle.setC(c);
//    }

    public void push(Memento memento){
        history.push(memento);
    }

    public void undo(){
        if (history.empty()){
            return;
        }

        final Memento memento = history.pop();
        memento.restore();
    }

}