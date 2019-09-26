package main.defaults.multipleInheritance;

public interface InterfaceC {

    default void interfaceMethodC() {
        System.out.println("Inside interfaceMethodC!!");
    }
}
