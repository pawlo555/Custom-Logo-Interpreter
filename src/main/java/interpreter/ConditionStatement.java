package interpreter;

public interface ConditionStatement extends Statement{

    boolean getBooleanValue(Executor executor);
}
