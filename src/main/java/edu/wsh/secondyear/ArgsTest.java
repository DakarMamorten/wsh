package edu.wsh.secondyear;

public class ArgsTest {
    public static void main(String[] args) {
        int i ;
        for (i = 0; i < args.length; ++i) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }

}
