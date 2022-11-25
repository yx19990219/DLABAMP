package test;

import org.junit.Test;

/**
 * @author Shawn
 */
public class testDemo {

    private static int a = 1;
    private static boolean t2runned = false;

    @Test
    public void test(){

        Integer x = new Integer(200);
        Integer y = new Integer(200);
        System.out.println(x == y);
    }
}

class PrintNum implements Runnable{
    int num=1;
    @Override
    public void run() {
        synchronized (this){
            while (true){
//                notify();//唤醒wait()的一个或者所有的线程
                if (num<=100){
                    System.out.println(Thread.currentThread().getName()+":"+num);
                    num++;
                }else {
                    break;
                }
                try {
                    wait();//释放当前的锁，另一个线程就进来
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

