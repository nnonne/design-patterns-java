package handler;

public class Request {

    public enum OperationType {
        addition,
        subtraction,
        multiplication,
        division
    }

    private double number1;
    private double number2;
    private OperationType operationType;

    public Request(double number1, double number2, OperationType operationType) {
        this.number1 = number1;
        this.number2 = number2;
        this.operationType = operationType;
    }

    public OperationType getType() {
        return this.operationType;
    }
    public double getNumber1() {
        return this.number1;
    }
    public double getNumber2() {
        return this.number2;
    }
}
