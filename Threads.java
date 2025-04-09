public class Threads extends Thread {
    int Threadnumber;
    public static void main(String[] args) {
        Threads threadArray[]=new Threads[10];
        for(int i=0;i<5;i++){
            threadArray[i]=new Threads();
            threadArray[i].Threadnumber=i;
            threadArray[i].start();
        }
    }
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" Thread number: "+Threadnumber);
        }
    }
}