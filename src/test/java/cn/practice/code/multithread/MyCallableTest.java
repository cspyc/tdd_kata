package cn.practice.code.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 多线程实现的方式3：
 * A:创建一个线程池对象，控制要创建几个线程对象。
 * public static ExecutorService newFixedThreadPool(int nThreads)
 *
 * B:这种线程池的线程可以执行：
 * 可以执行Runnable对象或者Callable对象代表的线程 做一个类实现Runnable接口。
 *
 * C:调用如下方法即可
 * Future<?>submit(Runnable task)
 * <T> Future<T> submit(Callable<T> task)
 *
 * D:我就要结束，可以吗? 可以。
 */
public class MyCallableTest {

    public static void main(String[] args) {
        //创建线程池对象-固定线程数的线程池
        ExecutorService threadPool = Executors.newFixedThreadPool(4);

        //可以执行Runnable对象或者Callable对象代表的线程
        threadPool.submit(new MyCallable());
        threadPool.submit(new MyCallable());

        threadPool.submit(new MyRunnable());
        threadPool.submit(new MyRunnable());

        //结束
        threadPool.shutdown();
    }
}
