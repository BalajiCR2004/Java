import java.util.*;
public class timeTaken{
    public static void main(String[] args){
        ArrayList<Integer> arrayLst=new ArrayList<>();
        LinkedList<Integer> linkedLst=new LinkedList<>();
        Vector<Integer> vector=new Vector<>();
        Random random=new Random();
        int n=10000000;
        long array_startTime=System.currentTimeMillis();
        for(int i=0;i<=n;i++){
            arrayLst.add(random.nextInt(1000000));
        }
        long array_endTime=System.currentTimeMillis();

          
        long linked_startTime=System.currentTimeMillis();
        for(int i=0;i<=n;i++){
            linkedLst.add(random.nextInt(1000000));
        }
        long linked_endTime=System.currentTimeMillis();

        long vector_startTime=System.currentTimeMillis();
        for(int i=0;i<=n;i++){
            vector.add(random.nextInt(1000000));
        }
        long vector_endTime=System.currentTimeMillis();

        System.out.println("In Linked list for inserting "+n+" elements takes: "+(linked_endTime-linked_startTime)+" ms");
        System.out.println("In Array list for inserting "+n+" elements takes: "+(array_endTime-array_startTime)+" ms");
        System.out.println("In Vector for inserting "+n+" elements takes: "+(vector_endTime-vector_startTime)+" ms");
        
        long array_startTime1=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            arrayLst.removeFirst();
        }
        long array_endTime1=System.currentTimeMillis();

        
        long linked_startTime1=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            linkedLst.removeFirst();
        }
        long linked_endTime1=System.currentTimeMillis();

        long vector_startTime1=System.currentTimeMillis();
        for(int i=0;i<n;i++){
            vector.removeFirst();
        }
        long vector_endTime1=System.currentTimeMillis();

        System.out.println("In Linked list for remove "+n+" elements takes: "+(linked_endTime1-linked_startTime1)+" ms");
        System.out.println("In Array list for remove "+n+" elements takes: "+(array_endTime1-array_startTime1)+" ms");
        System.out.println("In Vector for remove "+n+" elements takes: "+(vector_endTime1-vector_startTime1)+" ms");
    }
}