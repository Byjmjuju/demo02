package com.example.demo02.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@Accessors(chain = true)
public class User {

    private int id;
    private String name;
    private int age;
    private String email;

}
