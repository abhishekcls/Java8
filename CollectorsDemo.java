import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Employee> emps=new ArrayList<>();
	    emps.add(new Employee(101,"aaa",78000,34));
        emps.add(new Employee(102,"bbb",65000,26));
        emps.add(new Employee(103,"ccc",45000,45));
        emps.add(new Employee(104,"ddd",34000,34));
        emps.add(new Employee(105,"eee",25000,24));

        //All intermediary stream are lazy they don't get executed unless termal stream is called
        /*
        List<String> Names=emps.stream().filter(e->e.Age>30).map(e->e.EName).collect(Collectors.toList());
        System.out.println(Names);

        Set<String> Names2=emps.stream().filter(e->e.Age>30).map(e->e.EName).collect(Collectors.toSet());
        System.out.println(Names2);

        List<Integer> Ages=emps.stream().map(e->e.Age).collect(Collectors.toList());
        System.out.println(Ages);

        Set<Integer> Ages2=emps.stream().map(e->e.Age).collect(Collectors.toSet());
        System.out.println(Ages2);

        Map<Integer,List<Employee>> emps2= emps.stream().collect(Collectors.groupingBy(e-> e.Age));
        System.out.println(emps2);
        //Downstream Collector
        Map<Integer,Long> emps3= emps.stream().collect(Collectors.groupingBy(e-> e.Age,Collectors.counting()));
        System.out.println(emps3);

        Map<String,Number> m1=emps.stream().collect(Collectors.toMap(e->e.EName,e->e.Salary));
        System.out.println(m1);
        //System.out.println(emps.stream().collect(Collectors.toMap(e->e.EName,e->e.Salary)));
        //System.out.println(emps.stream().collect(Collectors.partitioningBy(e-> e.Age>30)));
        */
        Map<Integer,Set<String>> emps4= emps.stream()
                                        .collect(Collectors.groupingBy(e-> e.Age,Collectors.mapping(e->e.EName,Collectors.toSet())));
        System.out.println(emps4);

/*
        List<Employee> abc=new ArrayList<>();
        emps.stream().skip(2).peek(abc::add).forEach(System.out::println);//peek(intermediary stream) and forEach(terminal stream) are same(accepts Consumer)
        //emps.stream().peek(abc::add).skip(2).forEach(System.out::println);//in this peek is before skip hence it will add all emps in the list
        System.out.println(abc);

        emps.stream().skip(2).limit(2).forEach(System.out::println);
        emps.stream().limit(2).forEach(System.out::println);
        emps.stream().map(e->e.Age).distinct().forEach(System.out::println);
        */
    }
    
}
