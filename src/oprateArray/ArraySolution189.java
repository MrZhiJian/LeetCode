package oprateArray;

/**
 * �����㷨֮��ת����
 * 
 * @author Together
 *
 */
public class ArraySolution189 {

	/**
	 * ����һ�����飬�������е�Ԫ�������ƶ� k ��λ�ã����� k �ǷǸ�����
	 * @param nums
	 * @param k
	 */
	public void rotate(int[] nums, int k) {
        if(nums.length==0 || nums.length==1) {
        	return ;
        }
        int i=0;
        k=k%nums.length;
        while (i<k) {
			int temp=nums[nums.length-1];
			for(int j=nums.length-1;j>0;j--) {
				nums[j]=nums[j-1];
			}
			nums[0]=temp;
			i++;
		}
    }
}
