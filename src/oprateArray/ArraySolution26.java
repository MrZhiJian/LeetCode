package oprateArray;

/**
 * 初级算法之从排序数组中删除重复项
 * leetcode第26题
 * 
 * @author Together
 *
 */
public class ArraySolution26 {

	/**
	 * 从排序数组中删除重复项
	 *  给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
	 *  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
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
	
}
