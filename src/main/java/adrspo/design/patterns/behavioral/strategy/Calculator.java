package adrspo.design.patterns.behavioral.strategy;

public class Calculator implements Operation {

    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    @Override
    public int executeOperation(int a, int b) {
        return operation.executeOperation(a, b);
    }

}
