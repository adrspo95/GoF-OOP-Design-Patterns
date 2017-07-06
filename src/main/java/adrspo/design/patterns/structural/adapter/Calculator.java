package adrspo.design.patterns.structural.adapter;

public class Calculator {

    public int amount(int values[]) {
        return values.length;
    }

    public double avg(int values[]) {
        int sum = 0;
        for (int x : values) {
            sum += x;
        }
        double avg = (double) sum / values.length;
        return avg;
    }

    public int min(int values[]) throws Exception {
        if (values.length == 0) throw new Exception("Empty array");

        int min = values[0];

        for (int x : values) {
            if (x < min) min = x;
        }
        return min;

    }

    public int max(int values[]) throws Exception {
        if (values.length == 0) throw new Exception("Empty array");

        int max = values[0];

        for (int x : values) {
            if (x > max) max = x;
        }
        return max;

    }
}
