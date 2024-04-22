public class ConcreteVisitor implements Visitor {
    @Override
    public void visitElementA(ElementA elementA) {
        elementA.featureA();
        System.out.println("Visited elementA");
    }

    @Override
    public void visitElementB(ElementB elementB) {
        elementB.featureB();
        System.out.println("Visited elementB");
    }
}
