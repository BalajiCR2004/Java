import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class streamApi2 {
    public static void main(String[] args) {
        ArrayList<Integer> salList=new ArrayList<>(Arrays.asList(10,40,20,50,30,25,15));
        //count of salary greater than 25
        System.out.println(salList.stream().filter(s->s>25).count());
        //count of salary lesser than 25
        System.out.println(salList.stream().filter(s->s<25).count());
        //increasing the salary if salary is less than 25
        salList.stream().filter(s->s<25).map(s->s*2).forEach(System.out::println);

        ArrayList<Integer> salListUpdated=(ArrayList<Integer>)salList.stream().filter(s->s<25).map(s->s*2).collect(Collectors.toList());

        System.out.println(salListUpdated);

        System.out.println(salList.stream().reduce(0,(f,s)->f+s));


    }
}
