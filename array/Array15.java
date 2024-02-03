public class Array15 {

    public static int buyAndSellStock(int prices[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(buyprice<prices[i]){
               int profit=prices[i]-buyprice;//today's profit
               maxprofit=Math.max(maxprofit, profit);
            }else{
                buyprice=prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyAndSellStock(prices));

    }
}
