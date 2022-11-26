package edu.wsh.firstyear;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    private String name;
    private Integer hours;
    private Double points;
}
