//https://www.geeksforgeeks.org/java-stream-findany-with-examples/
//https://www.geeksforgeeks.org/stream-anymatch-java-examples
import java.util.stream.*;
import java.util.*;
public class Stream4 {
    public static void main(String[] args) {
        // Creating a Stream of Strings
        Stream<String> stream = Stream.of("Abhishek", "aBC");
  
        // Check if Character at 0th index is
        // UpperCase in any string or not using
        // Stream anyMatch(Predicate predicate)
        boolean answer = stream.anyMatch(str -> Character.isUpperCase(str.charAt(0)));
  
        // Displaying the result
        System.out.println(answer);
        //------------------------------
        List<String> list2 = Arrays.asList("Abhishek", "aBC");
        Optional<String> ans = list2.stream().findAny();
  
        // if the stream is empty, an empty
        // Optional is returned.
        if (ans.isPresent()) {
            System.out.println(ans.get());
        }
        else {
            System.out.println("no value");
        }
//====================================================================
        // Creating a List of Integers
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
  
        // Using Stream findAny() to return
        // an Optional describing some element
        // of the stream
        Optional<Integer> answer2 = list.stream().findAny();
  
        // if the stream is empty, an empty
        // Optional is returned.
        if (answer2.isPresent()) {
            System.out.println(answer2.get());
        }
        else {
            System.out.println("no value");
        }
    }
}
