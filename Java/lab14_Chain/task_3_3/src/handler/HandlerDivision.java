package handler;

public class HandlerDivision  extends Handler {

    @Override
    public void handle(Request request) {
        if (request.getType() == Request.OperationType.division) {
            double n1 = request.getNumber1();
            double n2 = request.getNumber2();
            if (n2 == 0) {
                System.out.println("Error (division by zero)");
            }
            else {
                System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
            }
        }
        else {
            super.handle(request);
        }
    }
}