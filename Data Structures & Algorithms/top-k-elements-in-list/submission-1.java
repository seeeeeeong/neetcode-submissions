class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<List<Integer>> boxes = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            boxes.add(new ArrayList<>());
        }
        for (int num : count.keySet()) {
            int freq = count.get(num);
            boxes.get(freq).add(num);
        }

        List<Integer> ordered = new ArrayList<>();
        for (int f = nums.length; f >= 1; f--) {
            ordered.addAll(boxes.get(f));
        }

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = ordered.get(i);
        }

        return answer;
    }
}
