import java.util.function.Consumer;

public class methodReferenceOperator {
    public static void main(String[] args) {
        Consumer<String> consumer=System.out::println; //we can use :: operator only on static members
        consumer.accept("Poda poi queuela vaada");
    }
}
