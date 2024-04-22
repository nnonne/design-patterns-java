public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        elementA.featureA();
        System.out.println("Visited elementA");
    }

    @Override
    public void visit(ElementB elementB) {
        elementB.featureB();
        System.out.println("Visited elementB");
    }
}
