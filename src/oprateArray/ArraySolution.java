package oprateArray;

/**
 * �����㷨֮����
 * 
 * @author Together
 *
 */
public class ArraySolution {

	/**
	 * ������������ɾ���ظ���
	 *  ����һ���������飬����Ҫ��ԭ��ɾ���ظ����ֵ�Ԫ�أ�ʹ��ÿ��Ԫ��ֻ����һ�Σ������Ƴ���������³��ȡ�
	 *  ��Ҫʹ�ö��������ռ䣬�������ԭ���޸��������鲢��ʹ�� O(1) ����ռ����������ɡ�
	 *  
	 * @param nums
	 * @return
	 */
	public int removeDuplicates(int []nums) {
		if(nums.length==0) {
			return 0;
		}
		int index=0;
		for(int i=1;i<nums.length;i++) {
			if(nums[index]!=nums[i]) {
				index++;
				nums[index]=nums[i];
			}
		}
		index+=1;
		return index;
	}
	
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
