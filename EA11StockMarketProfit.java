public class EA11StockMarketProfit {
    public static void main(String args[]){
        int [] arr={7,28,1,4,5,19,4,25,30,12,22};
        int profit=0;
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            profit=Math.max(profit,arr[i]-temp);
            if(arr[i]<temp){
                temp=arr[i];
            }
        }
        System.out.println(profit);
    }
}
