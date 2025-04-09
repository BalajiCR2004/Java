package util;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOddnumbers {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        ArrayList<Integer> numList=new ArrayList<>();
        for(int i=0;i<=n;i++){
            temp=sc.nextInt();
            if(temp%2!=0){
                numList.add(temp*temp);
            }
        }
        for (Integer i : numList) {
            System.out.println(i);
        }
    }
}
