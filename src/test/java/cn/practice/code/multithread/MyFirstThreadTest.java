package cn.practice.code.multithread;

import org.junit.Test;

public class MyFirstThreadTest {
    @Test
    public void multiThreadTest(){
        MyFirstThread thread1 = new MyFirstThread("第一个线程：");
        MyFirstThread thread2 = new MyFirstThread("第二个线程：");

        thread1.start();
        thread2.start();


        for(int i= 0;i<5;i++){
            System.out.println("i = " + i + "主线程调用...over..." +
                    Thread.currentThread().getName());
        }
    }
}
