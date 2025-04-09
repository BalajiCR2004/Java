public class arr2 {
    public static void main(String[] args){
        boolean duplicate=false;
        int iterations=0;
        int array[]={3,4,5,6,5};
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                iterations++;
                if(array[i]==array[j]){
                    duplicate=true;
                    break;
                }
            }
        }
        System.out.println(duplicate);
        System.out.println(iterations);
    }
}
