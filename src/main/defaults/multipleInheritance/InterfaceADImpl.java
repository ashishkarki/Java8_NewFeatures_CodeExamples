package main.defaults.multipleInheritance;

public class InterfaceADImpl implements InterfaceA, InterfaceD {
    // since both Interface A and D have exactly same signatured default methods, Java through error here
    // the only way to solve the issue is to implement the conflicting method in this implementation class

    public void interfaceMethodA() {
        System.out.println("Inside interfaceMethodA!! " + InterfaceADImpl.class);
    }

    public static void main(String[] args) {
        var interfaceADImpl = new InterfaceADImpl();
        interfaceADImpl.interfaceMethodA();
    }

}
