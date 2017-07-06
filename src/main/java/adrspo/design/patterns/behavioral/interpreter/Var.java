package adrspo.design.patterns.behavioral.interpreter;

import java.util.Map;

public class Var implements Expression {

    String var;

    public Var(String var) {
        this.var = var;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return context.get(var);
    }

}
