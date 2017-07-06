package adrspo.design.patterns.behavioral.strategy;

public class MultiplyOperation implements Operation {

    @Override
    public int executeOperation(int a, int b) {
        return a * b;
    }

}
