public class ElementA implements Element {
    public void featureA(){
        System.out.println("feature A");
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
}
