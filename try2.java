import java.util.Scanner;

public class try2 {
    public static int multi(int num1,int num2){
        int temp=0;
        for(int i=1;i<=num2;i++){
            temp=temp+num1;
        }
        return temp;
    }
    public static void main(String[] args){

        System.out.println(RandomNumberGenerator.random5numGenerator());
        
    }
}
