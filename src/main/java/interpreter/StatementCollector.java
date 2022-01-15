package interpreter;

import interpreter.statements.Statement;

import java.util.LinkedList;
import java.util.Queue;

public class StatementCollector {
    LinkedList<LinkedList<Statement>> listOfLists = new LinkedList<>();
    Queue<LinkedList<Statement>> collectedLists = new LinkedList<>();
    private boolean inComment = false;

    public void addStatement(Statement statement) {
        listOfLists.getFirst().addLast(statement);
    }

    public void endCollecting() {
        collectedLists.add(listOfLists.removeFirst());
    }

    public void startCollecting() {
        listOfLists.addFirst(new LinkedList<>());
    }

    public boolean isCollecting() {
        return !listOfLists.isEmpty();
    }

    public LinkedList<Statement> getCollectedStatements() {
        return collectedLists.remove();
    }

    public void startEndComment() {
        inComment = !inComment;
    }

    public boolean isComment(){return inComment;}
}
