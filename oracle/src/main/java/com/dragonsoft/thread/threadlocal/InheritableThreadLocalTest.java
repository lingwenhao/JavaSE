package com.dragonsoft.thread.threadlocal;

/**
 * @author ronin
 * @version V1.0
 * @desc
 * @since 2019/7/25 9:19
 */
public class InheritableThreadLocalTest {
    /***
     * 测试子线程获取子线程中的设置的值
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        new MainThread().start();
    }

    private static ThreadLocal<String> threadLocal = new ThreadLocal<String>();
    private static ThreadLocal<String> inheritableThreadLocal = new InheritableThreadLocal<String>();

    /**
     * 主线程
     */
    public static class MainThread extends Thread {
        @Override
        public void run() {
            try {
                //在主线程给 ThreadLocal 和 InheritableThreadLocal 设值
                String value = "hello world";
                System.out.println("主线程设置ThreadLocal的值为 " + value);
                threadLocal.set(value);
                inheritableThreadLocal.set(value);

                /*
                 * 在主线程创建子线程，这时候子线程会把主线程的InheritableThreadLocal的内容copy一份给自己用，
                 * 因为InheritableThreadLocal的内容是copy出来，所以当主线程改变了InheritableThreadLocal的
                 * 内容，子线程的内容不同步改变。同样，子线程改变了InheritableThreadLocal的内容，主线程的内容
                 * 不会同步改变。所以从子线程创建之后，两个线程的InheritableThreadLocal是独立的了。
                 */
                ChildThread childThread = new ChildThread();
                childThread.start();

                Thread.sleep(1000);
                System.out.println();

                //子线程创建之后再改变InheritableThreadLocal的值，子线程是不会影响的。
                value = "changed";
                System.out.println("主线程设置ThreadLocal的值为 " + value);
                threadLocal.set(value);
                inheritableThreadLocal.set(value);

                Thread.sleep(1000);
                //子线程改变了InheritableThreadLocal的值，主线程一样也不会影响。
                System.out.println();
                System.out.println("在主线程获取ThreadLocal的值：" + threadLocal.get());
                System.out.println("在主线程获取InheritableThreadLocal的值：" + inheritableThreadLocal.get());

                childThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 子线程
     */
    public static class ChildThread extends Thread {
        @Override
        public void run() {
            try {
                //获取ThreadLocal的值
                getThreadLocal();
                Thread.sleep(1500);

                //在主线程修改了ThreadLocal的值之后再获取值，会获取到原来没修改之前的值
                System.out.println("子线程获取重设之后的值 ---");
                getThreadLocal();

                //在子线程修改ThreadLocal的值再让主线程获取，同样主线程也会获取不到子线和改后的值
                System.out.println();
                String value = "I'm still a kid.";
                System.out.println("在子线程设置ThreadLocal的值为：" + value);
                threadLocal.set(value);
                inheritableThreadLocal.set(value);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void getThreadLocal(){
            System.out.println("在子线程中获取ThreadLocal的值：" + threadLocal.get());
            System.out.println("在子线程中获取InheritableThreadLocal的值：" + inheritableThreadLocal.get());
        }
    }

}
