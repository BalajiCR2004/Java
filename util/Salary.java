package util;

import java.util.ArrayList;
import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        Double temp=0.0;
        ArrayList<Double> sal=new ArrayList<>();
        ArrayList<Double> salWithTax=new ArrayList<>();
        for(int i=0;i<=n;i++){
            temp=sc.nextDouble();
            sal.add(temp);
            if(temp>=50000){
                salWithTax.add(temp*0.10);
            }
        }
        
        System.out.println(sal);
        System.out.println(salWithTax);
    }
}
