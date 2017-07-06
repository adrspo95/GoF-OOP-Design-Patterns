package adrspo.design.patterns.structural.adapter;

public class CalculatorAdapter implements Counter {

    private Calculator calculator = new Calculator();

    @Override
    public int count(int[] values) {
        return calculator.amount(values);
    }

    @Override
    public double average(int[] values) {
        return calculator.avg(values);
    }

    @Override
    public int minimum(int[] values) throws Exception {
        return calculator.min(values);
    }

    @Override
    public int maximum(int[] values) throws Exception {
        return calculator.max(values);
    }

}
