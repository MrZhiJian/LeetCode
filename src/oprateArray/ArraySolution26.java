package oprateArray;

/**
 * �����㷨֮������������ɾ���ظ���
 * leetcode��26��
 * 
 * @author Together
 *
 */
public class ArraySolution26 {

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
	
}
