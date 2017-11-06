package io.javabrains.unit1;

public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();

        Greeting greetingImplementor = new HelloWorldGreeting();

        Greeting greeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World !");
            }
        };

        Greeting lambda = () -> System.out.println("Hello World from Lambda !");

        greeter.greet(greetingImplementor);
        greeter.greet(greeting);
        greeter.greet(lambda);

    }
}
