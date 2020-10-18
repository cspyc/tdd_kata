package cn.practice.code.multithread;

import java.util.concurrent.Callable;

/**
 * @author pi
 */
public class MyCallable implements Callable {
    //Callable:是带有泛型的接口
    //这里指定的泛型是call方法的返回值类型

    @Override
    public Object call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程ID：" + Thread.currentThread().getId() +
                    "线程名：" + Thread.currentThread().getName() +
                    "...循环计数：" + i);
        }
        return null;
    }
}
