package main.defaults.multipleInheritance;

public interface InterfaceD {

    default void interfaceMethodA() {
        System.out.println("Inside interfaceMethodA!! " + InterfaceD.class);
    }
}
