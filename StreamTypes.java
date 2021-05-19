import java.util.stream.*;
import java.util.function.*;
import java.util.*;

public class StreamTypes {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = s -> s.length() > 2;

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        stream
        //.filter(p1.and(p2))
        .filter(p2.or(p3))
        .forEach(System.out::println);

        //=========================
        List<Integer> ar= Arrays.asList(1,2,3,4,5);

        Stream<Integer> s=ar.stream();
        Predicate<Integer> p11=Predicate.isEqual(2);
        Predicate<Integer> p22=Predicate.isEqual(3);

        List<Integer> output=new ArrayList<>();
        s.peek(System.out::println)//intermediary
                .filter(p11.or(p22))//2,3//intermediary
                .forEach(output::add);//terminal

        System.out.println(output);

        s=ar.stream();
        p11=i->i%2==0;
        s.filter(p11.or(p22))//2,3,4//intermediary
         .forEach(System.out::println);//terminal

        Stream<Integer> ss=Stream.of(1,2,3);
        Predicate<Integer> p=Predicate.isEqual(2);
        Stream<Integer> s2=ss.filter(p);
        s2.forEach(System.out::print);
    }
}
