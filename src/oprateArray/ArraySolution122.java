package oprateArray;

/**
 * 初级算法之买卖股票的最佳时机 II
 * leetcode第122题
 * 
 * @author Together
 *
 */
public class ArraySolution122 {

	/**
	 * 买卖股票的最佳时机 II
	 * 给定一个数组，它的第 i 个元素是一支给定股票第 i 天的价格。
	 * 设计一个算法来计算你所能获取的最大利润。你可以尽可能地完成更多的交易（多次买卖一支股票）。
	 * 注意：你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
	 *
	 * @param prices
	 * @return
	 */
	public int maxProfit(int[] prices) {
		int sum=0;
		Integer count=null;
		for(int i=0;i<prices.length-1;i++) {
			if(prices[i]<prices[i+1]) {
				if(count==null)
					count=prices[i];
			}else if(prices[i]>prices[i+1]){
				if (count!=null) {
					sum+=prices[i]-count;
					count=null;
				}
			}
			if(i==prices.length-2 && count!=null) {
				sum+=prices[prices.length-1]-count;
			}
		}
        return sum;
    }
}
