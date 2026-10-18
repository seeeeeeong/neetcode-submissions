class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer> keys = new ArrayList<>(count.keySet());


        // keys.sort((a, b) -> {
        //     if (count.get(a) > count.get(b)) return -1;
        //     if (count.get(a) < count.get(b)) return 1;
        //     return 0;
        // });

        keys.sort((a, b) -> Integer.compare(count.get(b), count.get(a)));

        int[] answer = new int[k];
        for (int i = 0; i < k; i++) {
            answer[i] = keys.get(i);
        }

        return answer;
    }
}
