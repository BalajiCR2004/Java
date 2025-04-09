import java.util.Scanner;

public class div2 {
    public static int divi(int num1,int num2){
        int count=0;
        while(num1>1){
            num1=num1-num2;
            count++;
        }
            
        return count;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        System.out.println(divi(number1,number2));
        sc.close();
        
    }
}
