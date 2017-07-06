package adrspo.design.patterns.behavioral.interpreter;

import java.util.Map;

public class And implements Expression {

    Expression first;
    Expression second;

    public And(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return first.interpret(context) && second.interpret(context);
    }

}
