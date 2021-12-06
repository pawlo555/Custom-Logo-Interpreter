package interpreter.statements;

import interpreter.Executor;
import interpreter.Statement;
import interpreter.VariableValue;

import java.util.List;

public class StatementProcedureCall implements Statement {

    private final String name;
    private final List<VariableValue> variableValueList;

    public StatementProcedureCall(String name, List<VariableValue> variableValueList) {
        this.name = name;
        this.variableValueList = variableValueList;
    }

    @Override
    public void execute(Executor executor) {
        Procedure procedure = executor.getEnvironment().getProcedure(name);
        assert procedure.variableNamesList.size() == variableValueList.size():
                "Number of procedure arguments is different than passed arguments";
        executor.getEnvironment().enterBlock();
        for (int i = 0; i< variableValueList.size(); i++) {
            executor.getEnvironment().addVariable(procedure.variableNamesList.get(i), variableValueList.get(i));
        }
        procedure.execute(executor);

        executor.getEnvironment().exitBlock();
    }
}