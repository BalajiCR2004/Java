import java.util.*;
public class arr1 {
    public static void main(String[] args){
        int lucky[] = {1,2,3,5,8,7};
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean flag=false;
        for (int i : lucky){
            if(i==number){
                flag=true;
                break;
            }
        }
        System.out.println(flag);
        sc.close();

    }
}
