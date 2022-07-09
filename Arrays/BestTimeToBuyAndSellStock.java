class BestTimeToBuyAndSellStock {
    
    public static int maxProfit(int[] prices) {
     
            int max=Integer.MIN_VALUE,profit=0;
            int n = prices.length;
           
            
            
            for(int i=0; i<n; i++)
            {
                
                for(int j=i+1; j<n; j++)
                {
                    profit= prices[j] - prices[i];
                    if(profit > max)
                    {
                        max = profit;
                    }
                }
                
            }
            if( max < 0)
            {
                return 0;
            }
            else{
                return max;
            }
            
        
        
    }
    public static void main(String[] args) {
        int[] pr = {2,4,1};
        System.out.println(maxProfit(pr));
    }
}
