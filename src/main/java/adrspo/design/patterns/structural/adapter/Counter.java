package adrspo.design.patterns.structural.adapter;

public interface Counter {

    int count(int values[]);

    double average(int values[]);

    int minimum(int values[]) throws Exception;

    int maximum(int values[]) throws Exception;
}
