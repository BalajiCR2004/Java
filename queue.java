import java.util.*;

public class queue {
    public static void main(String[] args) {
        TreeSet<String> Alphabets=new TreeSet<>();
        Alphabets.add("D");
        Alphabets.add("B");
        Alphabets.add("C");
        Alphabets.add("A");

        Queue<String> Alphabet=new LinkedList<>();
        Alphabet.add("D");
        Alphabet.add("B");
        Alphabet.add("C");
        Alphabet.add("A");

        Queue<Integer> alphabet=new PriorityQueue<>();
        alphabet.add(12);
        alphabet.add(43);
        alphabet.add(22);
        alphabet.add(69);

        System.out.println(alphabet.poll());
        // System.out.println(alphabet.peek());

        for (Integer s : alphabet) {
            System.out.println(s);
            
        }
        for (String s : Alphabets) {
            System.out.println(s);
            
        }

        for (String s : Alphabet) {
            System.out.println(s);
            
        }
    }

}
