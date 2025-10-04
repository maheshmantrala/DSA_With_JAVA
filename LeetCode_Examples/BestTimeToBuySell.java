package DSA.LeetCode_Examples;

public class BestTimeToBuySell {
      public static int max(int[] prices){
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int price:prices){
          if(price<minprice){
            minprice=price;
          }
          else{
            maxprofit=Math.max(maxprofit, price-minprice);//heart of algorithm
          }
        }
        return maxprofit;
      }

    public static void main(String[] args) {
        int[][] testCases = {
            {7,1,5,3,6,4},    // normal case
            {7,6,4,3,1},      // decreasing
            {1,2,3,4,5},      // strictly increasing
            {3,3,3,3,3},      // flat
            {2,4,1}           // tricky small input
        };

        for (int[] prices : testCases) {
            System.out.println("Prices: " + java.util.Arrays.toString(prices) + 
                               " → Max Profit = " +max(prices));
        }
    }
}


