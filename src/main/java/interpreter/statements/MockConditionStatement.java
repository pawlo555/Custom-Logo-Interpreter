package interpreter.statements;

import interpreter.ConditionStatement;
import interpreter.Executor;

public class MockConditionStatement implements ConditionStatement {
    private boolean conditionValue;

    @Override
    public boolean getBooleanValue(Executor executor) {
        return conditionValue;
    }

    @Override
    public void execute(Executor executor) {

    }

    public void setConditionValue(boolean conditionValue) {
        this.conditionValue = conditionValue;
    }
}
