package com.dragonsoft.thread_producer_cunsumer;

public class SetThread implements Runnable{
    private Student student;

    public SetThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        student.setName("张三");
        student.setAge(18);
    }
}
