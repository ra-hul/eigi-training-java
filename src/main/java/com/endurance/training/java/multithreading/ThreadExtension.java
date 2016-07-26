package com.endurance.training.java.multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rahul.go on 26/07/16.
 */
public class ThreadExtension
{
    public static void main(String[] args) throws InterruptedException
    {
        List<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3));
        Thread t = new Thread(new SquareWorker(data));
        data.add(4);
        data.add(5);
        Thread t1 = new SquareRootWorker(data);

        t.start();
        t1.start();

        t.join();
        t1.join();
        System.out.println("Done..");
    }

    static class SquareRootWorker extends Thread
    {
        List<Integer> payload;

        public SquareRootWorker(List<Integer> payload)
        {
            this.payload = payload;
        }

        public void run()
        {
            for (Integer integer : payload)
            {
                System.out.println("ThreadId: " + Thread.currentThread().getId() + " " + Math.sqrt(integer));
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ignored)
                {
                    //ignored
                }
            }
        }
    }

    static class SquareWorker implements Runnable
    {
        List<Integer> payload;

        public SquareWorker(List<Integer> payload)
        {
            this.payload = payload;
        }

        public void run()
        {

            for (Integer integer : payload)
            {
                System.out.println("ThreadId: " + Thread.currentThread().getId() + " " + Math.pow(integer, 2));
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException ignored)
                {
                    //ignored
                }
            }
        }
    }
}
