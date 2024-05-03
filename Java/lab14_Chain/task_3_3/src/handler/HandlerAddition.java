package handler;

public class HandlerAddition extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getType() == Request.OperationType.addition) {
            double n1 = request.getNumber1();
            double n2 = request.getNumber2();
            System.out.println(n1 + " + " + n2 + " = " + (n1+n2));
        }
        else {
            super.handle(request);
        }
    }
}
