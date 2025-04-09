public class arr3 {
    public static void main(String[] args){
        int target=11;
        int iterations=0;
        int luck_arr[]={7,3,5,4,1,2,6};
        for (int i=0;i<luck_arr.length;i++){
            for(int j=i+1;j<luck_arr.length;j++){
                iterations++;
                if(luck_arr[i]+luck_arr[j]==target){
                    System.out.println("("+luck_arr[i]+","+luck_arr[j]+")");
                }
            }
        }
        System.out.println(iterations);
    }
}
