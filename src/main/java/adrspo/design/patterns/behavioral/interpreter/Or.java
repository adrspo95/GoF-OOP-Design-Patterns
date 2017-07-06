package adrspo.design.patterns.behavioral.interpreter;

import java.util.Map;

public class Or implements Expression {

    Expression first;
    Expression second;

    public Or(Expression first, Expression second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean interpret(Map<String, Boolean> context) {
        return first.interpret(context) || second.interpret(context);
    }

}
