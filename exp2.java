public class exp2 {
    public static void main(String[] args){
        int[] stockPrices={2,4,5,7,2,1,7};
        int profit=0;
        int minstockprice=stockPrices[0];
        for(int i=1;i<stockPrices.length;i++){
            
            if(stockPrices.length>1){
                minstockprice=Math.min(minstockprice,stockPrices[i]);
                profit=Math.max(profit,stockPrices[i]-minstockprice);

            }
        }
        System.out.println(profit);
        
    }
}
