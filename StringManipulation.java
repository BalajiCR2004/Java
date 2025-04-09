import java.util.Scanner;

public class StringManipulation {
    public static boolean isPalindrome(String str){     
        String rev="";
        for (int i=(str.length())-1;i>=0;i--) {
            rev=rev+str.charAt(i);
        }
        if(str.equals(rev)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(isPalindrome(input));
    }
}