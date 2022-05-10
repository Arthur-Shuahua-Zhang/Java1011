package day5;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadCreation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 1, extends Thread
        Thread t1 = new MyThread();
        t1.start();

        // 2, Runnable
        Thread t2 = new Thread(new RunnableThread());
        t2.start();

        // 3, Callable
        FutureTask task = new FutureTask(new CallableThread());
        Thread t3 = new Thread(task);
        t3.start();
        System.out.println(task.get());



    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("extends thread class, " + Thread.currentThread().getName());
    }
}

class RunnableThread implements Runnable {

    @Override
    public void run() {
        System.out.println("implements Runnable interface, " + Thread.currentThread().getName());
    }
}

class CallableThread implements Callable {

    @Override
    public Integer call() throws Exception {
        System.out.println("implements Callable interface, " + Thread.currentThread().getName());
        return 200;
    }
}
