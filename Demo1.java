@FunctionalInterface
interface Calc{
    int square(int a);
}
public class Demo1 {
    public static void main(String[] args) {
        Calc c=s->s*s;

        System.out.println(c.square(5));
    }
}
