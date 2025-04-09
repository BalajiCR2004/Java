import java.util.ArrayList;
import java.util.Arrays;
public class ex2 {
    public static void main(String[] args) {
        ArrayList<String> strList=new ArrayList<>(Arrays.asList("Ab","bc","cS","rD"));
        strList.stream().map(s->s.toUpperCase()).forEach(System.out::println);
    }
}
