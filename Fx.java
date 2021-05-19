import java.util.function.Function;

public class Fx {
    public static void main(String[] args) {
        // Function<String,String> f=String::toLowerCase;
        Function<String, String> f = s -> s.toLowerCase();

        String val = f.apply("Abhishek");
        System.out.println(val);
    }
}
