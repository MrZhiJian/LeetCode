package oprateArray;

/**
 * 初级算法之旋转数组
 * 
 * @author Together
 *
 */
public class ArraySolution189 {

	/**
	 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
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
