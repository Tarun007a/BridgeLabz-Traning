package com.objectmodeling.level1.universitysystem;

import java.util.ArrayList;
import java.util.List;

class Faculty {
    String name;

    // constructor
    Faculty(String name) {
        this.name = name;
    }

    // method to print about faculty
    void display() {
        System.out.println("Faculty: " + name);
    }
}
