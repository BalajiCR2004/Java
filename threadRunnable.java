public class threadRunnable implements Runnable{
    public int Threadnumber;
        public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            threadRunnable Thread1=new threadRunnable();
            Thread1.Threadnumber=i;
            Thread Thread2=new Thread(Thread1);
            Thread2.start();
        }
        }
    
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i+" Thread number: "+Threadnumber);
        }
    }
}