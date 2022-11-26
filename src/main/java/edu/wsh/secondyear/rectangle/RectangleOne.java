package edu.wsh.secondyear.rectangle;

public class RectangleOne {
    private int length;
    private int width;

    public static void main(String[] args) {
        RectangleOne rectangleOne = new RectangleOne();
        rectangleOne.insert(11,15);
        rectangleOne.print();
    }

    public void insert(int length, int width){
        this.length = length;
        this.width = width;
    }

    public void print(){
        System.out.println("length = " + length);
        System.out.println("width = " + width);
    }
}
