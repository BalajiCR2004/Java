import java.util.Scanner;

public class try1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        sc.close();
        
        try{
            int number1=sc.nextInt();
            int number2=sc.nextInt();
            System.out.println(number1/number2);
        }
        catch(IllegalStateException e){
            System.out.println("error occured: "+e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("error occured: "+e.getMessage());
        }
        
        finally{
            System.out.println("sucess");
        }
    }
}
