package io.javabrains.unit3;

public class MethodReferenceExample1 {

    public static void printMessage() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(MethodReferenceExample1::printMessage);
        // MethodReferenceExample1::printMessage === () -> printMessage()
        thread.start();
    }
}
