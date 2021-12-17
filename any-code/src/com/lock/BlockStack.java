package com.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BlockStack {

    private volatile int size;
    private Object[] objects = null;
    private volatile int index = 0;
    Lock lock = new ReentrantLock();
    Condition notEmpty = lock.newCondition();


    public BlockStack(int size) {
        this.size = size;
        objects = new Object[size];
    }


    public void put(Object object) {
        lock.lock();
        try {
            if (index == size) {
                notEmpty.await();
            } else {
                objects[index] = object;
                index++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("stack index:" + index);
        }
    }

    public Object get() {
        lock.lock();
        try {
            if (index == 0) {
                notEmpty.signalAll();
            } else {
                index--;
                return objects[index];
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("stack index:" + index);
        }
        return "";
    }
}
