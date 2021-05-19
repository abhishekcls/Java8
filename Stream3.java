import java.util.*;
import java.util.stream.*;
public class Stream3 {
    public static void main(String[] args) {
        ArrayList<Integer> ar=new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);

        List<Integer> l1=ar.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l1);

        List<Integer> l2=ar.stream().map(i->i*i).collect(Collectors.toList());
        System.out.println(l2);

        int data[] = { 1, 2, 3, 4, 5 };

      //iterative way to compute sum and average of an array
      int sum = 0;
      //declarative way to compute sum and average of an array
      sum = Arrays.stream(data).sum();

      System.out.println(sum);
    }
}
