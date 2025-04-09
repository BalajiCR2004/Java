public class prime1 {
    public static void primenos(int number1,int number2){
        boolean[] primerange=new boolean[number2+1];
        for(int i=2;i<number2;i++){
            int temp=i*2;
            int multi=3;
            while(temp<=number2){
                if((primerange[temp]==false)){
                    primerange[temp]=true;  
                }
                temp=i*multi;
                multi++;
            }
            
        }
        for(int i=1;i<=number2;i++){
            if(primerange[i]==false){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        primenos(1, 19);
    }
}

