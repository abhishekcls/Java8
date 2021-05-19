import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class PredicateDemo{
    public static void main(String[] args) {
        List<Integer> ar= Arrays.asList(1,2,3,4,5);

        Stream<Integer> s=ar.stream();
        Predicate<Integer> p1=Predicate.isEqual(2);
        Predicate<Integer> p2=Predicate.isEqual(3);

        List<Integer> output=new ArrayList<>();
        s.peek(System.out::println)//intermediary
                .filter(p1.or(p2))//2,3//intermediary
                .forEach(output::add);//terminal

        System.out.println(output);

        s=ar.stream();
        p1=i->i%2==0;
        s.filter(p1.or(p2))//2,3,4//intermediary
         .forEach(System.out::println);//terminal
    }
}