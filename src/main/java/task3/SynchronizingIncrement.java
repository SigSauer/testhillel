package task3;

import java.util.concurrent.locks.ReentrantLock;

public class SynchronizingIncrement {

    /**
     * Task: Write three different method options for getNextValue() that will return
     *          'value++' each method needs to be synchronized in a different way.
     */
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
