package edu.interview.oop;

import java.util.ArrayList;
import java.util.List;

public class CollectionUtils {

  public void print(Shape[] shapes) {

  }

  public void print(List<Shape> shapes) {
  }
//  public void print(List<? extends Shape> shapes) {
//  }

}

class Main {

  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    CollectionUtils utils = new CollectionUtils();
    utils.print(circles);

    List<Circle> circleList = new ArrayList<>();
//    utils.print(circleList);

  }
}
