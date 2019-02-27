/**
 * @author Jiacheng Huang
 * @date 2019/02/28 00:02
 */
public class SearchInsertPosition {
    public int solution(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){

            if(nums[i]==target){
                return i;
            }
            if(i==nums.length-1&&nums[i]<target){
                return i+1;
            }
            if(i==nums.length-1&&nums[i]>target){
                return i;
            }
            if(nums[i]<target){
                continue;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return 0;
    }
}
