package com.babyachievement;

public class TestConcurrent {
    String name = "Bleep";

    public void setName(String name) {
        this.name = name;
    }

    public void setBackgrund() throws InterruptedException {
        Thread alvin = new Thread(new Runnable() {
            @Override
            public void run() {
                setName("Blat");
            }
        });

        alvin.start();
        alvin.join();

        System.out.println(Thread.currentThread());
        System.out.println(name);
    }

    public static void main(String[] args) throws InterruptedException {
        new TestConcurrent().setBackgrund();
        System.out.println(Thread.currentThread());
    }
}
