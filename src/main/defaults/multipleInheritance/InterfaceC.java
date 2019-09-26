package main.defaults.multipleInheritance;

public interface InterfaceC extends InterfaceB {

    default void interfaceMethodC() {
        System.out.println("Inside interfaceMethodC!!");
    }
}
