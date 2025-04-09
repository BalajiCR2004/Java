public class ref {
    public static void changeval(int[] arr){
        arr[0]=0;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={29,38,69,23,131,13};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        changeval(arr);
        
    }
}
