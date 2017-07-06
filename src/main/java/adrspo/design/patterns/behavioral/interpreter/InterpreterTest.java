package adrspo.design.patterns.behavioral.interpreter;

import java.util.HashMap;
import java.util.Map;

public class InterpreterTest {
    public static void main(String[] args) {

        Expression e = new And(
                new Or(
                        new Var("a"),
                        new Var("b")
                ),
                new Not(
                        new Var("c")
                )
        );

        Map<String, Boolean> context = new HashMap<String, Boolean>();
        context.put("a", false);
        context.put("b", false);
        context.put("c", false);

        System.out.println(e.interpret(context));
    }
}
