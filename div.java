import java.util.*;
public class div {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        try{
            System.out.println(number1/number2);
        }
        catch(ArithmeticException e){
            System.out.println("error occured: "+e.getMessage());
        }
        finally{
            System.out.println("sucess");
        }
        sc.close();
    }
    
}
