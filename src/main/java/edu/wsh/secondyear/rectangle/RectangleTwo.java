package edu.wsh.secondyear.rectangle;

public class RectangleTwo {
    private int length;
    private int width;

    public static void main(String[] args) {
        RectangleTwo rectangleTwo = new RectangleTwo(11,15);
        rectangleTwo.print();
    }

    public RectangleTwo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void print(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
    }
}
