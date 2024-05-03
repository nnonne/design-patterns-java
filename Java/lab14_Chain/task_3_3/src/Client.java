import handler.*;

public class Client {
    public static void main(String[] args) {
        Request[] requests = {
                new Request(1, 1, Request.OperationType.addition),
                new Request(1, 1, Request.OperationType.subtraction),
                new Request(2, 2, Request.OperationType.multiplication),
                new Request(4, 2, Request.OperationType.division),
        };

        Handler handlerAddition = new HandlerAddition();
        Handler handlerSubtraction = new HandlerSubtraction();
        Handler handlerMultiplication = new HandlerMultiplication();
        Handler handlerDivision = new HandlerDivision();

        handlerAddition.setNext(handlerSubtraction);
        handlerSubtraction.setNext(handlerMultiplication);
        handlerMultiplication.setNext(handlerDivision);

        for (Request request : requests) {
            handlerAddition.handle(request);
        }
    }
}