package edu.wsh.thirdyear.lab4.zad2;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Wątek uruchomiony: " + this.getName());
    }

    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();

        MyThread namedThread1 = new MyThread();
        MyThread namedThread2 = new MyThread();

        namedThread1.setName("CustomThread-1");
        namedThread2.setName("CustomThread-2");

        namedThread1.start();
        namedThread2.start();
    }
}
