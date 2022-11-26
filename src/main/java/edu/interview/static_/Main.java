package edu.interview.static_;

public class Main {
  private static String str = "Hello";

  private static void change(String s){
    s = "gg wp";
  }

  public static void main(String[] args) {
    change(str);
    System.out.println(str);

  }


}
