package com.dragonsoft.thread_producer_cunsumer;

public class GetThread implements Runnable{
    private Student student;

    public GetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        String name = student.getName();
        Integer age = student.getAge();
        System.out.println("name:"+name+"---"+"age:"+age);
    }
}
