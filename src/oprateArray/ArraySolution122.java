package oprateArray;

/**
 * �����㷨֮������Ʊ�����ʱ�� II
 * leetcode��122��
 * 
 * @author Together
 *
 */
public class ArraySolution122 {

	/**
	 * ������Ʊ�����ʱ�� II
	 * ����һ�����飬���ĵ� i ��Ԫ����һ֧������Ʊ�� i ��ļ۸�
	 * ���һ���㷨�����������ܻ�ȡ�������������Ծ����ܵ���ɸ���Ľ��ף��������һ֧��Ʊ����
	 * ע�⣺�㲻��ͬʱ�����ʽ��ף���������ٴι���ǰ���۵�֮ǰ�Ĺ�Ʊ����
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
