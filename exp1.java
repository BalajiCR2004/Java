public class exp1 {
    public static void main(String[] args){
        int[] stockPrice={2,3,2,1,5,9,7};
        int buyVal=0;
        int sellVal=0;
        int maxProfit=0;
        int curr_profit=0;
        for(int i=0;i<stockPrice.length;i++){
            for(int j=i+1;j<stockPrice.length;j++){
                curr_profit=stockPrice[j]-stockPrice[i];
                if(curr_profit>maxProfit){
                    maxProfit=curr_profit;
                    buyVal=i+1;
                    sellVal=j+1;
                }
            }
        }
        System.out.println("Buy at Day: "+buyVal);
        System.out.println("Sell at Day: "+sellVal);
        System.out.println("Maximum Profit: " +maxProfit);
    }
}
