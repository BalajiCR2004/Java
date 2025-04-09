import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class streamApi {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        Stream<Integer> stream=numList.stream();
        //System.out.println(stream.count());           
        //streams can only travel once and cannot be travelled again if we need to travel we need to create a new stream
        //stream.forEach(n->System.out.println(n));
        //stream.forEach(System.out::println);
        //filters are used as a conditions
        Stream<Integer> streamFilter=stream.filter(n->n<5);
        Stream<Integer> streamsort=streamFilter.sorted((f,s)->s-f);
        Stream<Integer> streamMap=streamsort.map(s->s*10);
        streamMap.forEach(System.out::println);
        System.out.println();
        numList.stream().filter(n->n%2!=0).map(s->s*s).forEach(System.out::println);
        System.out.println();
        Stream<Integer> evenList=numList.stream().filter(n->n%2==0);
        

    }
}
