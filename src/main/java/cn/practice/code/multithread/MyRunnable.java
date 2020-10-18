package cn.practice.code.multithread;

/**
 * @author pi
 */

public class MyRunnable implements Runnable {
//1.类实现Runnable接口

    //2.覆写接口中的run方法，将线程的任务代码封装到run方法中
    @Override
    public void run() {
        show();
    }

    private void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("线程ID:" + Thread.currentThread().getId() + "......" +
                    "线程名：" + Thread.currentThread().getName() + "......循环计数：" + i);
        }
    }


}
