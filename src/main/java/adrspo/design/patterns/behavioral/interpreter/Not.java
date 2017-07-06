package adrspo.design.patterns.behavioral.interpreter;

import java.util.Map;

public class Not implements Expression {

    Expression exp;

    public Not(Expression exp) {
        this.exp = exp;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return !exp.interpret(context);
    }

}
