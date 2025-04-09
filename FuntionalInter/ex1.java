import java.util.ArrayList;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        numList.stream().map(s->s*s).forEach(System.out::println);
    
    }
}
