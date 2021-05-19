import java.util.*;
import java.util.function.*;
public class FunctionalInfc {
    public static void main(String[] args) {
        List<String> values=new ArrayList<>();
        values.add("abc");
        values.add("xyz");

        //values.forEach(System.out::println);//Consumer
        //values.forEach(v->System.out.println(v));//Consumer println maps with accept

        Supplier<String> s=()->"Java is Fun";
        System.out.println(s.get());

        Consumer<String> c= v-> System.out.println(v.toUpperCase());
        c.accept("Abhishek");
        //BiConsumer
        Predicate<Integer> p= age-> age>=18;
        System.out.println(p.test(45));
        System.out.println(p.test(4));
        //BiPredicate
        Function<Integer,Integer> square= n->n*n;
        System.out.println(square.apply(5));
        //BiFunction

        BiConsumer<String, String> b = (s1, s2)->System.out.println(s1.concat(s2));
        b.accept("Aman", "Sharma");

        BiPredicate<Integer, Integer> bp = (i1,i2)->i1>i2;
        System.out.println(bp.test(4,5));

        BiFunction<Integer, Integer, Integer> m = (m1,m2)->m1+m2;
        System.out.println(m.apply(3,4));

        UnaryOperator<String> str= msg-> msg.toUpperCase();
        System.out.println(str.apply("Samanta"));

        BinaryOperator<Integer> add=(a,bb)->a+bb;
        System.out.println(add.apply(2, 3));

        //Comparator<Integer> com=(i1,i2)->Integer.compare(i1, i2);
        Comparator<Integer> com=Integer::compare;
        System.out.println(com.compare(20, 10));
    }
}
