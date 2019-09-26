package main.defaults.multipleInheritance;

public interface InterfaceB extends InterfaceA {

    default void interfaceMethodB() {
        System.out.println("Inside interfaceMethodB!!");
    }

    @Override
    default void interfaceMethodA() {
        // this method will take precedence over any parent interfaces
        System.out.println("Inside interfaceMethodA!! " + InterfaceB.class);
    }

}
