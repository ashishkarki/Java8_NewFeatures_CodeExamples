package main.defaults.multipleInheritance;

public interface InterfaceB {

    default void interfaceMethodB() {
        System.out.println("Inside interfaceMethodB!!");
    }
}
