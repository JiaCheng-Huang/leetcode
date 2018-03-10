class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
         vector<int> result;
         for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){
                    result.insert(result.begin(),i);
                    result.insert(result.begin()+1,j);
                    return result;
                }
            }
        }
        return result;
    }
};