@FunctionalInterface
interface MyInterface{
    void InterfaceMethod();
}
@FunctionalInterface
interface MyInterface2{
    void InterfaceMethod(String name);
}
//Task->return value
class Sample{
    public static void disp(String name){
        System.out.println("Hello "+name);
    }

    public static void disp2(){
        System.out.println("Hi");
    }
}
public class MethodRef {
    public static void main(String[] args) {
        MyInterface2 my=Sample::disp;//method ref
        my.InterfaceMethod("Abhishek");
    }
}
