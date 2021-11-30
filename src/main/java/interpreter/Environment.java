package interpreter;

import interpreter.statements.Procedure;

import java.util.HashMap;

public class Environment {

    HashMap<String, Procedure> procedureHashMap = new HashMap<>();

    public void addProcedure(String name, Procedure procedure) {
        procedureHashMap.put(name, procedure);
    }

    public Procedure getProcedure(String name) {
        if (!procedureHashMap.containsKey(name)) {
            throw new IllegalArgumentException("There is no procedure with name: " + name);
        }
        return procedureHashMap.get(name);
    }
}
