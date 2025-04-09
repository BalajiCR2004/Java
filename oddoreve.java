import java.util.*;
public class oddoreve{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int multitwo=a/2;
        int temp=multitwo*2;
        if((temp-a)==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}