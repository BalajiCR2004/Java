import java.util.*;
import util.StringConstants;
public class pal {
    public static int original_number,temp,rev;
    public static void palindrome(){
        if(temp>rev){
            rev=rev*10+(temp%10);
            temp=temp/10;
            palindrome();
        }
        else{
            if(temp==rev || temp==(rev/10)){
                System.out.println(StringConstants.PAL_NUM);
            }
            else{
                System.out.println(StringConstants.NOT_PAL_NUM);
            }
            
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        original_number=sc.nextInt();
        temp= original_number;
        palindrome();
        sc.close();
    }
}
