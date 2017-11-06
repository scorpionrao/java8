package io.javabrains.unit1;

public class RunnableExample {

    public static void main(String[] args) {

        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable inside Anonymous class");
            }
        });

        Thread myLambdaThread = new Thread(() -> System.out.println("Runnable inside Lambda thread"));

        myThread.run();
        myLambdaThread.run();
    }
}
