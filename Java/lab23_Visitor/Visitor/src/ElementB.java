public class ElementB implements Element {

    public void featureB(){
        System.out.println("feature B");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
