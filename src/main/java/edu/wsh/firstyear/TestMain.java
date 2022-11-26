package edu.wsh.firstyear;

import java.util.HashMap;
import java.util.Map;

public class TestMain {

  public static void main(String[] args) {
    final String string = "One Two One Three One Four Five Three";
    String[] split = string.split(" ");
    Map<String, Integer> map = new HashMap<>();
    for (String s : split) {
      if (map.containsKey(s)) {
        map.put(s, map.get(s) + 1);
      } else {
        map.put(s, 1);
      }
    }
    System.out.println(map);
  }

}
