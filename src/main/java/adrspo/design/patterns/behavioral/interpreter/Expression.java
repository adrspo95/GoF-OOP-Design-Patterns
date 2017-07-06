package adrspo.design.patterns.behavioral.interpreter;

import java.util.Map;

public interface Expression {
    public boolean interpret(Map<String, Boolean> context);
}