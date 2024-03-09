package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Boris");
        student.setGroup(2);
        student.setReceipt(new Date());
        System.out.println("Student: " + student.getFullName()
                + ". Grop: " + student.getGroup() + ". Data: " + student.getReceipt());
    }
}
