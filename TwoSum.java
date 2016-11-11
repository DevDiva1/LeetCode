//Brute Force approach 
//Time Complexity - O(n^2)
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0;i< nums.length; i++)
        {
          for(int j=1;j<nums.length;j++)
          {
              if(target == nums[i]+nums[j] && i!=j)
              {
                  result[0]=i;
                  result[1]=j;
              }
          }
        }
        return result;
    }
}

//Additional Space complexity
//Utlilizing Hash Table datastructure
public class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i = 0; i<nums.length;i++){
            m.put(nums[i], i);
        }
        for(int i=0; i<nums.length; i++){
            if(m.containsKey(target-nums[i]) && m.get(target-nums[i])!=i)
                return new int[]{i, m.get(target-nums[i])};
        }
        return new int[]{0};
    }
}
