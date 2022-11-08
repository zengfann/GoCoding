/*
 *  确定一个数组 i [i]
 * 在i天买入d[i]股票 j 卖入[j]卖出 求最大利润
 */


class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
        {
            return 0;
        }
        int buy = prices[0];
        int max = 0;
        for(int i= 1;i<prices.length;i++)
        {
            //当前数组于最小的差值
            max = Math.max(max,prices[i]-buy);
            //确定数组最小的数
            buy = Math.min(buy,prices[i]); 
        }
        return max;
    }
}