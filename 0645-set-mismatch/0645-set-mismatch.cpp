class Solution {
public:
    vector<int> findErrorNums(vector<int>& nums) {
        set<int>se;
        int pahla=0,doosra=0;
        for(int i=0;i<nums.size();i++){
            if(se.find(nums[i])!=se.end()) pahla=nums[i];
            se.insert(nums[i]);
        }
        for(int i=1;i<=nums.size();i++){
            doosra^=i;
            doosra^=nums[i-1];
        }
        doosra^=pahla;
        return{pahla,doosra};
    }
};