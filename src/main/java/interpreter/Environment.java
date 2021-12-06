package interpreter;

import interpreter.statements.Procedure;

import java.util.HashMap;
import java.util.LinkedList;

public class Environment {

    HashMap<String, Procedure> procedureHashMap = new HashMap<>();
    LinkedList<HashMap<String, VariableValue>> variableHashMap = new LinkedList<>();

    public Environment() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void addProcedure(String name, Procedure procedure) {
        procedureHashMap.put(name, procedure);
    }

    public Procedure getProcedure(String name) {
        if (!procedureHashMap.containsKey(name)) {
            throw new IllegalArgumentException("There is no procedure named: " + name);
        }
        return procedureHashMap.get(name);
    }

    public VariableValue getVariable(String name) {
        for (HashMap<String, VariableValue> map: variableHashMap) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
        }
        throw new IllegalStateException("There is no declared variable named:" + name);
    }

    public void addVariable(String name, VariableValue variableValue) {
        variableHashMap.getFirst().put(name, variableValue);
    }

    public void enterBlock() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void exitBlock() {
        variableHashMap.removeFirst();
    }

    public String getStringVariable(String name) {
        VariableValue variableValue = getVariable(name);
        return variableValue.getStringValue();
    }

    public double getNumericVariable(String name) {
        VariableValue variableValue = getVariable(name);
        return variableValue.getDoubleValue();
    }
}
