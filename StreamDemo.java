import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class Employee {
    public int EID;
    public String EName;
    public int Salary;
    public int Age;
    
    public  Employee(){}
    public  Employee(int id,String name,int sal,int age){
        EID=id;
        EName=name;
        Salary=sal;
        Age=age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EID=" + EID +
                ", EName='" + EName + '\'' +
                ", Salary=" + Salary +
                ", Age=" + Age +
                '}';
    }
}

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> emps=new ArrayList<>();
	    emps.add(new Employee(101,"aaa",78000,34));
        emps.add(new Employee(102,"bbb",65000,26));
        emps.add(new Employee(103,"ccc",45000,45));
        emps.add(new Employee(104,"ddd",34000,34));
        emps.add(new Employee(105,"eee",25000,24));

        //emps.forEach(System.out::println);
//Task -> age>30
/*
        Predicate<Employee> age = e -> e.Age>30;
        Stream<Employee> stm= emps.stream();
        stm.filter(age)
        //.map(e->e.EName)
        .forEach(e->System.out.println(e.EName));
        */
        //String names= ;
        //System.out.println(emps.stream().filter(e->e.Age>30).map(e->e.EName).collect(Collectors.joining(", ")));
        /*
        List<String> names= emps.stream().filter(e->e.Age>30).map(e->e.EName).collect(Collectors.toList());
        names.forEach(System.out::println);

        List<Employee> emp50KSal = emps.stream().filter(e -> e.Salary > 50000).collect(Collectors.toList());
        System.out.println("==============");
        emp50KSal.forEach(System.out::println);
        */
        //System.out.println("-----------");
        //emps.forEach(System.out::println);
        /*
        String result=emps.stream().filter(e->e.Age>30).map(e->String.valueOf(e.Age)).collect(Collectors.joining(", "));
        System.out.println(result);

        List<String> Names=emps.stream().filter(e->e.Age>30).map(e->e.EName).collect(Collectors.toList());
        System.out.println(Names);

        List<Employee> Employees=emps.stream().filter(e->e.Age>30).collect(Collectors.toList());
        System.out.println(Employees);
        */
/*
        List<Integer> sal= emps.stream().map(e->e.Salary).collect(Collectors.toList());
        Optional<Integer> sum= sal.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());
        */
        int total=emps.stream().mapToInt(e->e.Salary).sum();//Maulik Dusara
        System.out.println(total);

        Integer totalSalary =emps.stream().map(e->e.Salary).reduce(0,(e1,e2)->e1+e2);//Jayachandra Pendyala
        System.out.println(totalSalary);

        Optional<Integer> totalSalary2 = emps.stream().map(e->e.Salary).reduce((a,b)->a+b);//Roopal Rathod
        System.out.println(totalSalary2.get());

        System.out.println( emps.stream().mapToInt(e -> e.Salary).reduce(0, Integer::sum));//Shantanu Vijay

        List<Integer> sals= emps.stream().map(e->e.Salary).collect(Collectors.toList());
        System.out.println(sals);
        Optional<Integer> sum= sals.stream().reduce((a,b)->a+b);
        System.out.println(sum.get());

        Optional<Integer> max= sals.stream().reduce((a,b)->a>b?a:b);
        System.out.println(max.get());
/*
        Optional<Float> avg= sals.stream().mapToDouble();
        System.out.println(max.get());
        */
        System.out.println(sum.get()/sals.size());
        System.out.println(emps.stream().mapToInt(e->e.Salary).average());
    }
}
