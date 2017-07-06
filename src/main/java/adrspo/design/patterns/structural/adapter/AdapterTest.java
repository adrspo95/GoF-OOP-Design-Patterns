package adrspo.design.patterns.structural.adapter;

public class AdapterTest {

    public static void main(String args[]) {

        int digits[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Counter counter = new CalculatorAdapter();

        System.out.println("Avarage: " + counter.average(digits));
        System.out.println("Amount: " + counter.count(digits));

        try {
            System.out.println("Minimum: " + counter.minimum(digits));
            System.out.println("Maximum: " + counter.maximum(digits));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
