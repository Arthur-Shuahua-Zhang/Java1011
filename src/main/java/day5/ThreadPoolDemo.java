package day5;

import java.util.concurrent.*;

public class ThreadPoolDemo {

    public static void main(String[] args) {
//        ThreadPoolExecutor pool = new ThreadPoolExecutor(
//                2,
//                5,
//                2L,
//                TimeUnit.SECONDS,
//                new ArrayBlockingQueue<>(4),
//                Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()
//        );
//
//        for (int i=1; i<=10; i++) {
//            pool.execute(
//                    () -> {
//                        System.out.println(Thread.currentThread().getName() + "  is working");
//                    }
//            );
//        }
//
//        pool.shutdown();

        ExecutorService p1 = Executors.newFixedThreadPool(3);
        ExecutorService p2 = Executors.newSingleThreadExecutor();
        ExecutorService p3 = Executors.newCachedThreadPool();
        ExecutorService p4 = Executors.newScheduledThreadPool();


    }
}
