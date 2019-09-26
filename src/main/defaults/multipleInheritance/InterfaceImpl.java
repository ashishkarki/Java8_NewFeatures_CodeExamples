package main.defaults.multipleInheritance;

public class InterfaceImpl implements InterfaceA, InterfaceB, InterfaceC {

    public void interfaceMethodA() {
        // this will get highest precedence: the implementation class method's get highest precedence
        System.out.println("Inside interfaceMethodA!! " + InterfaceImpl.class);
    }

    public static void main(String[] args) {
        var interfaceImpl = new InterfaceImpl();

        interfaceImpl.interfaceMethodA();// this prints from InterfaceB, because Java in runtime resolves to child impl
        interfaceImpl.interfaceMethodB();
        interfaceImpl.interfaceMethodC();
    }
}
