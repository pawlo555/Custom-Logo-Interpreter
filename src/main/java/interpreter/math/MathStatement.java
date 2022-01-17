package interpreter.math;

import interpreter.Executor;
import interpreter.SpecialName;
import interpreter.VariableValue;
import interpreter.math.operations.doubleOperation.DoubleOperatorFactory;
import interpreter.math.operations.Operation;
import interpreter.math.operations.singleOperation.SingleOperationFactory;

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
                operators.push(Operators.LEFT_BRACKET.name());
            }
            else if (element.equals(")")){
                if (operators.isEmpty()) {
                    throw new IllegalStateException("Brakets mismatch");
                }
                String operator = operators.pop();
                while (!operator.equals(Operators.LEFT_BRACKET.name())) {
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
                operators.push(element);
            }
        }
        while (!operators.isEmpty()) {
            elementsInReverseNotation.addLast(operators.pop());
        }
    }

    public MathValue evaluate(Executor executor) {
        Stack<MathValue> valuesStack = new Stack<>();
        for (String element: elementsInReverseNotation) {
            if (MathElement.isValue(element)) {
                MathValue value = convertToValue(element, executor);
                valuesStack.push(value);
            }
            else {
                Operators operator = Operators.valueOf(element);
                Operation operation;
                int howManyArgumentsTakes = operator.howManyArgumentsTakes();
                if (howManyArgumentsTakes == 1) {
                    MathValue value = valuesStack.pop();
                    operation = SingleOperationFactory.factorOperation(operator, value);
                }
                else {
                    MathValue firstValue = valuesStack.pop();
                    MathValue secondValue = valuesStack.pop();
                    operation = DoubleOperatorFactory.factorOperation(operator, firstValue, secondValue);
                }
                MathValue evaluatedValue = operation.evaluate();
                valuesStack.push(evaluatedValue);
            }
        }
        return valuesStack.pop();
    }

    public MathValue convertToValue(String string, Executor executor) {
        if (VariableValue.isVariable(string)) {
            string = executor.getEnvironment().getStringVariable(string);
        }
        SpecialName name = SpecialName.checkValue(string);
        if (name != null) {
            string = executor.getEngine().getValue(name);
        }

        Integer integer = MathElement.parseInt(string);
        if (integer != null) {
            return new MathValue(integer);
        }
        Double doubleValue = MathElement.parseDouble(string);
        if (doubleValue != null) {
            return new MathValue(doubleValue);
        }
        Boolean booleanValue = MathElement.parseBoolean(string);
        if (booleanValue != null) {
            return new MathValue(booleanValue);
        }
        throw new IllegalStateException("Value: " + string +" cannot be parsed to MathValue");
    }
}
