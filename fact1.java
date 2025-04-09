public class fact1 {
    public static void zeros(int number){
        int zeroCount=0;
        int fives=5;
        while(number>=fives){
            zeroCount=zeroCount+(number/fives);
            fives=fives*5;
        }
            System.out.println(zeroCount);
        }
        
        
    
    public static void main(String[] args) {
        zeros(3);
        zeros(5);
        zeros(15);
        zeros(700);
        zeros(1243);
        zeros(1974);
    }
}
