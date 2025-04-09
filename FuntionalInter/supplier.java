import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<String> getWelcome=()->"Hello";//doesn't get anything but return something
        System.out.println(getWelcome.get());

        Consumer<String> sleep=t->System.out.println(t+" is sleeping");
        sleep.accept("Kratos"); //gets something and returns nothing

        Function<String,Integer> sleepTime=t->(t.length() );
        System.out.println(sleepTime.apply("kratos")); //gets something and returns something

        Predicate<Long> PassorFail =(t)->t>50; //returns True or False value

        System.out.println(PassorFail.test(70l));
    }
}
