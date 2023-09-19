package com.samoon.friends;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Friend {
    private long id;
    private String name;
    private String profession;
    private int age;
}
