
public class brackets {
    public static boolean checkBrackets(String bracketsList){
        if(bracketsList==null){
            return false;
        }
        int sum=0;
        for(int i=0;i<bracketsList.length();i++){
            if(bracketsList.charAt(i)=='{'){
                sum=sum+1;
            }
            else{
                sum=sum-1;
            }
            if(sum<0){
                sum = Integer.MIN_VALUE;
                break;
            }
        }
        if(sum==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(checkBrackets("{}{}}"));
    }
}
