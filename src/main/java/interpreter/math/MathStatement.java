package interpreter.math;

import java.util.LinkedList;
import java.util.Stack;

public class MathStatement {

    private final LinkedList<String> elementsInReverseNotation = new LinkedList<>();

    public MathStatement(LinkedList<String> elements) {
        Stack<String> operators = new Stack<>();
        for(String element: elements) {
            if (MathElement.isValue(element)) {
                elementsInReverseNotation.addLast(element);
            }
            else if (element.equals("(")) {
                operators.push(element);
            }
            else if (element.equals(")")){
                if (operators.isEmpty()) {
                    throw new IllegalStateException("Brakets mismatch");
                }
                String operator = operators.pop();
                while (!operator.equals(")")) {
                    elementsInReverseNotation.addLast(operator);
                    if (operators.isEmpty()) {
                        throw new IllegalStateException("Brakets mismatch");
                    }
                    operator = operators.pop();
                }
            }
            else if (MathElement.isOperator(element)) {
                boolean isRightCumulative = Operators.valueOf(element).isRightCumulate();
                int priority = Operators.valueOf(element).getPriority();
                while (!operators.isEmpty()) {
                    String operatorString = operators.peek();
                    Operators operator = Operators.valueOf(operatorString);
                    if (isRightCumulative) {
                        if (priority < operator.getPriority()) {
                            elementsInReverseNotation.addLast(operators.pop());
                        }
                        else {
                            break;
                        }
                    }
                    else if (priority <= operator.getPriority()){
                        elementsInReverseNotation.addLast(operators.pop());
                        }
                        else {
                            break;
                        }
                }
                operators.peek();
            }
        }
    }

    public void evaluate() {
        System.out.println(elementsInReverseNotation);
    }
}
