package task3;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizingIncrement {
    private int value = 0;

    public synchronized void firstWay() {
        this.value++;
    }

    private final Object lock = new Object();

    public void secondWay() {
        synchronized (lock) {
            value++;
        }
    }

    private final ReentrantLock reentrantLock = new ReentrantLock();

    public void thirdWay() {
        reentrantLock.lock();
        try {
            this.value++;
        } finally {
            reentrantLock.unlock();
        }
    }
}
