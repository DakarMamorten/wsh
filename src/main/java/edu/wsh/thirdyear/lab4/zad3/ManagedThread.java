package edu.wsh.thirdyear.lab4.zad3;

class ManagedThread extends Thread {
    private boolean suspended = false;
    private boolean stopped = false;

    public void run() {
        while (!stopped) {
            synchronized (this) {
                while (suspended) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Wątek pracuje: " + getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void suspendThread() {
        suspended = true;
    }

    public synchronized void resumeThread() {
        suspended = false;
        notify();
    }

    public void stopThread() {
        stopped = true;
    }

    public static void main(String[] args) throws InterruptedException {
        ManagedThread thread1 = new ManagedThread();
        ManagedThread thread2 = new ManagedThread();
        ManagedThread thread3 = new ManagedThread();

        thread1.start();
        thread2.start();
        thread3.start();

        Thread.sleep(3000);
        thread1.suspendThread();
        System.out.println("Wątek " + thread1.getName() + " zawieszony.");

        Thread.sleep(2000);
        thread1.resumeThread();
        System.out.println("Wątek " + thread1.getName() + " wznowiony.");

        Thread.sleep(2000);
        thread1.stopThread();
        thread2.stopThread();
        thread3.stopThread();
        System.out.println("Wątki zatrzymane.");
    }
}

