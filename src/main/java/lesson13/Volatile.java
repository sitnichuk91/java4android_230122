package lesson13;

import javax.swing.event.ChangeListener;

public class Volatile {
    private static volatile int myInt = 0;
    public static void main(String[] args) {
        new ChangeListener().start();
        new ChangeMaker().start();
    }

    static class ChangeListener extends Thread {
        @Override
        public void run(){
            int localVar = myInt;
            while (myInt < 5){
                if (localVar != myInt){
                    localVar = myInt;
                    System.out.println(localVar + " t1");
                }
            }
        }
    }

    static class ChangeMaker extends Thread {
        @Override
        public void run(){
            int localVar = myInt;
            while (myInt < 5){
                myInt = ++localVar;
                System.out.println(localVar + " t2");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
