package com.example.ovi.studentidentity;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ovi on 3/9/2017.
 */
public class Student {
    private String name;
    private int id;

    public Student(String name,int id) {
        this.name=name;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
