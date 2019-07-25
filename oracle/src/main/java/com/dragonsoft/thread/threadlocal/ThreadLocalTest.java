package com.dragonsoft.thread.threadlocal;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 9:37
 */
public class ThreadLocalTest {
    private static ThreadLocal<String> localThreadVariable = new ThreadLocal<String>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程名称
                Thread.currentThread().setName("thread-01");
                localThreadVariable.set("我是线程1中的变量");
                System.out.println(Thread.currentThread().getName()+":"+localThreadVariable.get());
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                //设置线程名称
                Thread.currentThread().setName("thread-02");
                localThreadVariable.set("我是线程2中的变量");
                System.out.println(Thread.currentThread().getName()+":"+localThreadVariable.get());
            }
        });

        //启动线程
        thread1.start();
        thread2.start();
    }
}
