package com.concurrent.aqs;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * 自定义独占锁
 * 
 */
public class Mutex implements Lock, Serializable {


    private  static  class  Sync extends AbstractQueuedSynchronizer{

        /**
         * 是否唯一的
         * 是否处于占用状态
         * @return
         */
        @Override
        protected boolean isHeldExclusively() {
           return getState()==1;
        }
        /**
         * 尝试获取锁
         * 当状态为0获取锁
         * @param acquires 获取
         * @return
         */
        @Override
        protected boolean tryAcquire(int acquires) {
            assert acquires==1;
            /**
             * 原子操作设置状态
             * 如果state 为0  则改state为1
             * 设置当前线程拥有独占访问
             */
            if(compareAndSetState(0,1)){
                setExclusiveOwnerThread(Thread.currentThread());
                return true;
            }
            return false;
        }

        /**
         * 尝试释放锁
         * @param releases
         * @return
         */
        @Override
        protected boolean tryRelease(int releases) {

            assert releases == 1;
            if(getState()==0){
                throw new IllegalMonitorStateException();
            }

            /**
             * 释放锁、设置当前线程占有的锁是null
             * 同时调用AQS的setState（）
             */
            setExclusiveOwnerThread(null);
            setState(0);
            return true;
        }

        ConditionObject newCondition(){return new ConditionObject();}

    }


    private  final  Sync sync=new Sync();


    @Override
    public void lock() {
        sync.acquire(1);
    }


    @Override
    public boolean tryLock() {
        return sync.tryAcquire(1);
    }


    @Override
    public void unlock() {
        sync.tryRelease(1);
    }


    @Override
    public Condition newCondition() {
        return sync.newCondition();
    }


    public boolean isLocked(){
        return sync.isHeldExclusively();
    }


    public boolean hasQueuedThreads(){
        return sync.hasQueuedThreads();
    }


    @Override
    public void lockInterruptibly() throws InterruptedException {
        sync.acquireInterruptibly(1);
    }


    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
       return sync.tryAcquireNanos(1, unit.toNanos(time));
    }

}
