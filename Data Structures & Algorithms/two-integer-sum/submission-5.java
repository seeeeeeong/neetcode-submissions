class Solution {
    public int[] twoSum(int[] nums, int target) {       
        int[] answer = new int[2];
        
        Map<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int n = target - nums[i];

            if (m.containsKey(n)) {
                answer[0] = m.get(n);
                answer[1] = i;
                return answer;
            }

            m.put(nums[i], i);
        }

        return answer;        
    }
}
