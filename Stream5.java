import java.util.stream.*;
import java.util.*;
public class Stream5 {
    public static void main(String[] args) {
        Stream<String> s1=Stream.of("Abhishek","abc","xyz");
        Stream<String> s11=Stream.of("abhishek","abc","xyz");

        Stream<Integer> s2=Stream.of(1,2,5,7,8);

        Integer[] arr={1,2,5,7,8};
        Stream<Integer> s3=Arrays.stream(arr);

        List<String> names=new ArrayList<>();
        s1.peek(names::add).forEach(System.out::println);

        System.out.println(names);

        boolean res=s11.anyMatch(str-> Character.isUpperCase(str.charAt(0)));
        System.out.println(res);

        Optional<Integer> res2=s2.findAny();
        System.out.println(res2.isPresent());
        System.out.println(res2.get());
        System.out.println("-------------");
        s3.skip(2).limit(2).forEach(System.out::println);
        System.out.println("-------------");
        Stream<Integer> s4=Stream.of(1,2,1,2,8);
        s4.distinct().forEach(System.out::println);

        List<Employee> emps=new ArrayList<>();
	    emps.add(new Employee(101,"aaa",78000,34));
        emps.add(new Employee(102,"bbb",65000,26));
        emps.add(new Employee(103,"ccc",45000,45));
        emps.add(new Employee(104,"ddd",34000,34));
        emps.add(new Employee(105,"eee",25000,24));

        //Order is not guaranteed
        emps.parallelStream().forEach(System.out::println);
    }
}
