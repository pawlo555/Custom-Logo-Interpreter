package com.programme.elements;

import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Monitor {

    private ReentrantLock lock = new ReentrantLock(true);
    private ArrayList<String> taskList = new ArrayList();
    Condition noTask = lock.newCondition();
    boolean resetEnv = false;


    public String getTask() throws InterruptedException {
        lock.lock();
        if(taskList.size() == 0){
            noTask.await();
        }
        String i = taskList.get(0);
        taskList.remove(0);
        lock.unlock();
        return i;
    }

    public void addTask(String task) {
        lock.lock();
        taskList.add(task);
        noTask.signal();
        lock.unlock();
    }

    public void inform() {
        lock.lock();
        resetEnv = true;
        lock.unlock();
    }

    public boolean checkIfReset(){
        if(resetEnv){
            resetEnv = false;
            return true;
        }
        return false;


    }
}
