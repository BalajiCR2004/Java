import java.util.ArrayList;
import java.util.Random;

public class forEach1 {
    public static void main(String[] args) {
        ArrayList<Integer> numList=new ArrayList<>();
        Random rand=new Random();
        for (int i = 0; i < 5; i++) {
               numList.add((rand.nextInt(10)));
        }

        numList.forEach(System.out::println);
        System.out.println();
        numList.forEach (n->System.out.println(n));
    }
}
