package com.company;

public class Main {

    public static class Print implements Runnable{
        private String string;
        private int times;

        public Print(String string, int times) {
            this.string = string;
            this.times = times;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < times; i++) {
                    System.out.print(string);
                }
                //  Thread.yield();
                Thread.sleep(20);
            }
            catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
    public static class PrintNum implements Runnable{
        private  int num;

        public PrintNum(int num) {
            this.num = num;
        }

        @Override
        public void run() {
           /* for (int i = 0; i < 50; i++) {
                System.out.print(num);
            }
            */

                for (int i = 1; i <= num; i++) {
                    System.out.print(" " + i);
                //    if (i <= 50) Thread.sleep(1);
                 //   Thread.yield();
                }
            Thread thread5 = new Thread(
                    new Print("D", 40));
            thread5.start();
            try {
                for (int i = 1; i <= num; i++) {
                    System.out.print (" " + i);
                    if (i == 50) thread5.join();
                }
            }
            catch (InterruptedException ex) {
            }
        }
    }
    public static void main(String[] args) {
	// write your code here
        Runnable printA = new Print("A", 50);
        Runnable printB = new Print("B", 50);
        Runnable printC = new Print("C", 50);
        Runnable printN = new PrintNum(60);
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
        Thread thread3 = new Thread(printC);
        Thread thread4 = new Thread(printN);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
