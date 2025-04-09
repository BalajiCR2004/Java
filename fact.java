public class fact {
    public static int factorial(int n){
        int temp=1;
        for(int i=1;i<=n;i++){
            temp=temp*i;
        }
        return temp;
    }
    public static int findzero(int n){
        int temp=0;
        while(n%10==0){
            n=n/10;
            temp++;
        }

        return temp;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
        System.out.println(factorial(10));
        System.out.println(factorial(15));
        System.out.println(findzero(factorial(5)));
        System.out.println(findzero(factorial(10)));
        System.out.println(findzero(factorial(15)));
    }
}
