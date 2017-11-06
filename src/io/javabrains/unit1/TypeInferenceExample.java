package io.javabrains.unit1;

public class TypeInferenceExample {

    public static void main(String[] args) {
        //  StringLengthLambda myLambda = (String s) -> s.length();
        //  StringLengthLambda myLambda = (s) -> s.length();
        //  StringLengthLambda myLambda = s -> s.length();
        //  System.out.println(myLambda.getlocation("Hello World!"));
        print(s -> s.length());
    }

    public static void print(StringLengthLambda lengthLambda) {
        System.out.println(lengthLambda.getlocation("Hello World!"));
    }

    interface StringLengthLambda {
        int getlocation(String s);
    }
}
