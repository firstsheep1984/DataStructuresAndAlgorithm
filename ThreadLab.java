package Threads;

public class ThreadLab {

    public ThreadLab() {

        Thread thread1 = new Thread(new Task1());
        Thread thread2 = new Thread(new Task2());
        Thread thread3 = new Thread(new Task3());
        Thread thread4 = new Thread(new Task4());

        thread2.start();
        thread1.start();
        thread3.start();
        thread4.start();

        try {
            // Context thread (which in this example is main) wait and
            // when thread1 finished join to thread1 and continue
            //
            //                    /----thread1----------------------------------------------------------\
            // main thread ______/_______calling thread1.join() from main thread .......................\__________
            //                              Hey main thread please wait for thread1 to finish its job
            //                              and join the thread1 at the end and continue
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i <250; i++) {
            System.out.println("Thread 0: 0 ");
        }
    }

    public static void main(String args[]) {
        new ThreadLab();
    }
}





class Task1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <250; i++) {
            System.out.println("Thread 1: 1111 ");
        }
    }
}

class Task2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <250; i++) {
            System.out.println("Thread 2: 22222222");
        }
    }
}

class Task3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <250; i++) {
            System.out.println("Thread 3: 3333333333333333");
        }
    }
}

class Task4 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <250; i++) {
            System.out.println("Thread 4: 44444444444444444444444444444");
        }
    }
}