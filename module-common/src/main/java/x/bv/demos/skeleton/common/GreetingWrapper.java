package x.bv.demos.skeleton.common;

public class GreetingWrapper {
    public static void sayHello() {
        System.out.println(Greeting.Companion.greeting());
    }

    public static void main(String[] args) {
        sayHello();
    }
}
