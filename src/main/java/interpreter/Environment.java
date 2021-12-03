package interpreter;

import interpreter.statements.Procedure;

import java.util.HashMap;
import java.util.LinkedList;

public class Environment {

    HashMap<String, Procedure> procedureHashMap = new HashMap<>();
    LinkedList<HashMap<String, Variable>> variableHashMap = new LinkedList<>();

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

    public Variable getVariable(String name) {
        for (HashMap<String, Variable> map: variableHashMap) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
        }
        throw new IllegalStateException("There is no declared variable named:" + name);
    }

    public void addVariable(String name, Variable variable) {
        variableHashMap.getFirst().put(name, variable);
    }

    public void enterBlock() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void exitBlock() {
        variableHashMap.removeFirst();
    }

    public String getStringVariable(String name) {
        Variable variable = getVariable(name);
        return variable.getStringValue();
    }

    public double getNumericVariable(String name) {
        Variable variable = getVariable(name);
        return variable.getNumericValue();
    }
}
