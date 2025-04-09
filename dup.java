public class dup {
    public static void main(String[] args){
        int[] arr={1,9,9,3,6,6,9,4};
        int[] arr1=new int[arr.length];
        int[] arr2=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            int count=0;
            
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
                if(count==2){
                    arr1[index]=arr[i];
                    index++;
                    break;
                }
            }
        }  
        arr1[0]=arr[0];
        index=0;
        for(int i=0;i<arr1.length-1;i++){
            if((arr1[i]!=arr1[i+1] )&&(arr1[i]!=0)){
                arr2[index]=arr1[i+1];
                index++;
            }
        }

        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
