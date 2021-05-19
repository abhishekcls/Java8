import java.util.*;

public class Demo4 {
    public static void main(String[] args) {
        String a[] = new String[] { "A", "B", "C", "D" };

        List<String> list = Arrays.asList(a);

        list.forEach(System.out::println);
        
        /*
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        for(String l:list){
            System.out.println(l);
        }
        */
    }
}
