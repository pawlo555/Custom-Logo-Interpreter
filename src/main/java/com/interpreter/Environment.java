package com.interpreter;

import com.interpreter.statements.Procedure;

import java.util.*;

public class Environment {

    private final HashMap<String, Procedure> procedureHashMap = new HashMap<>();
    private final LinkedList<HashMap<String, VariableValue>> variableHashMap = new LinkedList<>();

    public Environment() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void addProcedure(String name, Procedure procedure) {
        procedureHashMap.put(name, procedure);
    }

    public Procedure getProcedure(String name) {
        if (!procedureHashMap.containsKey(name)) {
            throw new IllegalStateException("There is no procedure named: " + name);
        }
        return procedureHashMap.get(name);
    }

    public VariableValue getVariable(String name) {
        int scopeNumber = name.lastIndexOf(':') + 1;
        return getVariable(name.substring(scopeNumber), scopeNumber);
    }

    private VariableValue getVariable(String name, int scope) {
        int currentScope = 1;
        for (HashMap<String, VariableValue> variableMap: variableHashMap) {
            if (variableMap.containsKey(name)) {
                if (scope == currentScope) {
                    return variableMap.get(name);
                }
                else {
                    currentScope++;
                }
            }
        }
        throw new IllegalStateException("There is no declared variable named: " + name);
    }

    public void addVariable(String name, VariableValue variableValue) {
        int scopeNumber = name.lastIndexOf(':') +1;
        addVariable(name.substring(scopeNumber), scopeNumber, variableValue);
    }

    private void addVariable(String name, int scope, VariableValue variableValue) {
        System.out.println(scope);
        int currentScope = 1;
        for (HashMap<String, VariableValue> variableMap: variableHashMap) {
            if (scope == currentScope) {
                variableMap.put(name, variableValue);
                return;
            }
            else {
                currentScope++;
            }
        }
        throw new IllegalStateException("Error during creating variable, wrong number of scope: " + scope);
    }

    public void assignVariable(String name, VariableValue variableValue) {
        int scopeNumber = name.lastIndexOf(':') + 1;
        assignVariable(name.substring(scopeNumber), scopeNumber, variableValue);
    }

    private void assignVariable(String name, int scope, VariableValue variableValue) {
        int currentScope = 1;
        for (HashMap<String, VariableValue> variableMap: variableHashMap) {
            if (variableMap.containsKey(name)) {
                if (scope == currentScope) {
                    variableMap.put(name, variableValue);
                    return;
                }
                else {
                    currentScope++;
                }
            }
        }
        throw new IllegalStateException("There is no variable named: " + name + " to assign value.");
    }

    public void enterBlock() {
        variableHashMap.addFirst(new HashMap<>());
    }

    public void exitBlock() {
        variableHashMap.removeFirst();
    }

    public Set<String> getVariablesNames() {
        Set<String> variablesNamesSet = new HashSet<>();
        for (HashMap<String, VariableValue> variablesHashMap: variableHashMap) {
            variablesNamesSet.addAll(variablesHashMap.keySet());
        }
        return variablesNamesSet;
    }

    public Set<String> getProceduresNames() {
        return procedureHashMap.keySet();
    }

    public String getStringVariable(String name) {
        int scopeNumber = name.lastIndexOf(':') + 1;
        VariableValue variableValue = getVariable(name.substring(scopeNumber), scopeNumber);
        return variableValue.getStringValue();
    }

    public void clean() {
        procedureHashMap.clear();
        variableHashMap.clear();
    }
}
