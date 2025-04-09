import java.util.Arrays;
public class generics {
    public static <K>void prints(K Output){
        System.out.println(Output);
    }
    public static void main(String[] args) {
        prints("addsf");
        prints(3);
        prints(3);
        prints(Arrays.asList(1,2,3,4,5));

    }
}
