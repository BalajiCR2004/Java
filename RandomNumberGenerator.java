import java.util.*;
public class RandomNumberGenerator {
    public static int random5numGenerator(){
        return (int)( Math.random()*100000);//generates a random double then we multipy it with 100000 and convert it to integer
    }
}
