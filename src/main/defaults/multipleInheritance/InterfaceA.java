package main.defaults.multipleInheritance;

public interface InterfaceA {

    default void interfaceMethodA() {
        System.out.println("Inside interfaceMethodA!! " + InterfaceA.class);
    }
}
