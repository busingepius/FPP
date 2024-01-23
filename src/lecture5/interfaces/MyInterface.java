package lecture5.interfaces;

public interface MyInterface {
    //public static final int MY_CONSTANT = 10;
    int MY_CONSTANT = 10;

    // public abstract void myAbstractMethod();
    void myAbstractMethod();

//    public default void myMethodWithBody(){
//        System.out.println("Implement method in an interface");
//    }

    default void myMethodWithBody(){
        System.out.println("Implemented method in an interface");
    }

//    public static void staticMethodInsideInterface(){
//        System.out.println("Static method inside an interface");
//    }

    static void staticMethodInterface(){
        System.out.println("Static method inside an interface");
    }
}
