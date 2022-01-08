package interpreter.statements;

import interpreter.Executor;
import interpreter.VariableValue;
import interpreter.math.MathStatement;
import interpreter.math.MathValue;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;

public class StatementProcedureCall extends AbstractStatement {

    private final String name;
    private final List<MathStatement> mathStatements;

    public StatementProcedureCall(ParserRuleContext ctx, String name, List<MathStatement> mathStatements) {
        super(ctx);
        this.name = name;
        this.mathStatements = mathStatements;
    }

    @Override
    public void customExecute(Executor executor) {
        Procedure procedure = executor.getEnvironment().getProcedure(name);
        if  (procedure.variableNamesList.size() == mathStatements.size()) {
            throw new IllegalStateException("Number of procedure arguments is different than passed arguments");
        }
        executor.getEnvironment().enterBlock();
        for (int i = 0; i< mathStatements.size(); i++) {
            MathValue value = mathStatements.get(i).evaluate(executor);
            executor.getEnvironment().addVariable(procedure.variableNamesList.get(i),
                    new VariableValue(value.toString()));
        }
        procedure.execute(executor);

        executor.getEnvironment().exitBlock();
    }
}