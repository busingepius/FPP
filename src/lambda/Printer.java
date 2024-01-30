package lambda;

public interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer{
    // can not restrict access modifier
    @Override
    public void print(String message){
        System.out.println(message);
    }
}

class Lambda{
    public static void main(String[] args) {
//        Printer cp = new ConsolePrinter(){
//            @Override
//            public void print(String m){
//                System.out.println(m);
//            }
//        };
        Printer cp  = (m)-> System.out.println(m);
        cp.print("kkkk");
    }

    static void staticMethod(Printer p){
        p.print("hhhh");
    }
}