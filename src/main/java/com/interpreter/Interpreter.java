package com.interpreter;

import com.programme.controllers.Controller;


public class Interpreter implements ConsoleListener {

    private final Executor executor;
    private final Controller controller;

    private Thread thread;

    public Interpreter(Executor executor, Controller controller) {
        this.executor = executor;
        this.controller = controller;
        controller.setInterpreter(this);
    }

    public void executeCode(String command) {
        thread = new ParserThread(executor, controller, command);
        thread.start();
    }

    public Executor getExecutor() {
        return executor;
    }

    public void stopThread() {
        if (thread != null) {
            System.out.println(thread);
            thread.interrupt();
        }
    }
}
