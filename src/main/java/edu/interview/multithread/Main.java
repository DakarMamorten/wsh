package edu.interview.multithread;

import lombok.SneakyThrows;

public class Main {

  @SneakyThrows
  public static void main(String[] args) {
    Thread thread = new Thread(new Runnable() {
      @SneakyThrows
      @Override
      public void run() {
        Thread.sleep(3000);
        System.out.println("Hello");
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("Vlad");
      }
    });

    thread.start();
    thread2.start();

  }
//  ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
}