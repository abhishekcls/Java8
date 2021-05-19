interface I1{
    void disp();
}
class C1 implements I1{
    public void disp(){
        System.out.println("C1");
    }
}
class C2 implements I1{
    public void disp(){
        System.out.println("C2");
    }
}
class Demo2{
    void show(I1 i){
        i.disp();
    }
    public static void main(String[] args) {
       Demo2 d= new Demo2();
       C1 c1=new C1();
       d.show(c1::disp);
    }
}