package cn.practice.code.multithread;

public class MyRunnableTest {

    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        //3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread类的构造函数的参数进行传递
        //将具体的任务传递到线程中
        Thread td1 = new Thread(mr);
        Thread td2 = new Thread(mr);

        //4.调用线程对象的start方法开启线程
        td1.start();
        td2.start();
    }
}
