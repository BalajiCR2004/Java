
import java.util.Arrays;
import java.util.List;

public class forEach{
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Geralt","Yennifer","Triss","Ciri");
        String message=" lives";

        names.forEach(name->System.out.println(name.equals("Ciri")?name+" dies":name+message));  //foreach is a internal loop and it is faster but it need more cost 
        System.out.println("");

        names.forEach(System.out::println); //Double colon operator(also known as method reference operator)
    }
}