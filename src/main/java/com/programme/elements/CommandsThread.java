package com.programme.elements;

import com.interpreter.Interpreter;

public class CommandsThread extends Thread {

    private final Monitor monitor;
    private final Interpreter interpreter;

    public CommandsThread(Monitor monitor, Interpreter interpreter){
        this.monitor = monitor;
        this.interpreter = interpreter;
    }
    public void run(){
        while(true){
            String programme = null;
            try {
                programme = monitor.getTask();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            interpreter.executeCode(programme);
            monitor.inform();

        }
    }
}
