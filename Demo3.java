@FunctionalInterface
interface Shape{
    void area();
}
class Circle{
    public void area1(){
        System.out.println("Circle Area");
    }
}
class Rectangle{
    public void area(){
        System.out.println("Rectangle Area");
    }
}
class Square{
    public void area(){
        System.out.println("Square Area");
    }
}
class Demo3{
    static void show(Shape s){
        s.area();
    }
    public static void main(String[] args) {
      
        Circle c=new Circle();
        show(c::area1);
        Rectangle r=new Rectangle();
        show(r::area);
        Square s=new Square();
        show(s::area);
    }
}