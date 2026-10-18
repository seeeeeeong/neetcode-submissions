// Map<정렬값, 기존값> 
// m.containsKey() : answer.add(List<>())

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {        
        Map<String, List<String>> m = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String s = new String(c);

            // if (!m.containsKey(s)) {
            //     m.put(s, new ArrayList<>());
            // }
            // m.get(s).add(strs[i]);

            m.computeIfAbsent(s, k -> new ArrayList<>()).add(strs[i]);
        }    

        return new ArrayList<>(m.values());
    }
}
